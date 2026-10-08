package irvine.oeis.a399;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399587 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A399587 extends Sequence1 {

  // Direct bit-by-bit search, with iterative deepening.

  private int mN;
  private int mSuffixMask;
  private int mClasses;

  /** Reversal class of each n-bit word. */
  private int[] mClass;

  /** Number of 64-bit words in the class mask. */
  private int mMaskWords;

  /** Current candidate binary string. */
  private int[] mBits;

  /** Number of currently covered classes. */
  private int mCovered;

  private static int reverse(final int x, final int n) {
    int y = 0;
    for (int k = 0; k < n; ++k) {
      y = (y << 1) | ((x >>> k) & 1);
    }
    return y;
  }

  private static Z bitsToZ(final int[] bits) {
    Z result = Z.ZERO;
    for (final int bit : bits) {
      result = result.multiply2();
      if (bit != 0) {
        result = result.add(Z.ONE);
      }
    }
    return result;
  }

  /*
   * Depth-first search.
   * We try bit 0 before bit 1, so the first solution found at a given
   * depth is lexicographically smallest.
   */
  private boolean search(final int suffix, final int remaining, final int position, final long[] seen) {
    // Every remaining transition can introduce at most one new class.
    if (mClasses - mCovered > remaining) {
      return false;
    }
    if (remaining == 0) {
      return mCovered == mClasses;
    }

    // Try 0 before 1
    for (int bit = 0; bit <= 1; ++bit) {
      final int word = (suffix << 1) | bit;
      final int cls = mClass[word];
      final int wi = cls >>> 6;
      final long mask = 1L << (cls & 63);
      final boolean fresh = (seen[wi] & mask) == 0;
      if (fresh) {
        seen[wi] |= mask;
        ++mCovered;
      }
      mBits[position] = bit;
      final int nextSuffix = word & mSuffixMask;
      if (search(nextSuffix, remaining - 1, position + 1, seen)) {
        return true;
      }
      if (fresh) {
        seen[wi] &= ~mask;
        --mCovered;
      }
    }
    return false;
  }

  /*
   * Assign consecutive class numbers to the reversal classes.
   */
  private void buildClasses(final int n) {
    mClass = new int[1 << n];
    final Map<Integer, Integer> map = new HashMap<>();
    for (int w = 0; w < (1 << n); ++w) {
      final int r = reverse(w, n);
      final int c = Math.min(w, r);
      Integer x = map.get(c);
      if (x == null) {
        x = map.size();
        map.put(c, x);
      }
      mClass[w] = x;
    }
    mClasses = map.size();
    mMaskWords = (mClasses + 63) >>> 6;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    if (mN >= 31) {
      throw new UnsupportedOperationException();
    }

    mSuffixMask = (1 << (mN - 1)) - 1;
    buildClasses(mN);

    /*
     * Start with the theoretical lower bound: one transition per reversal class.
     * Increase the number of transitions until a solution exists.
     */
    for (int extra = 0; ; ++extra) {
      final int transitions = mClasses + extra;
      mBits = new int[mN - 1 + transitions];

      /*
       * We try initial prefixes in lexicographic order.
       * Since S must start with 1, the first bit is fixed.
       */
      final int first = 1 << (mN - 2);
      for (int suffix = first; suffix <= mSuffixMask; ++suffix) {
        for (int k = mN - 2; k >= 0; --k) {
          mBits[mN - 2 - k] = (suffix >>> k) & 1;
        }

        // Allocate the covered-class bitset only once for this starting prefix
        final long[] seen = new long[mMaskWords];
        mCovered = 0;
        if (search(suffix, transitions, mN - 1, seen)) {
          return bitsToZ(mBits);
        }
      }
    }
  }
}
