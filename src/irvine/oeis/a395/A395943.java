package irvine.oeis.a395;

import java.util.LinkedHashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A395943 allocated for Chuck Seggelin.
 * @author Sean A. Irvine
 */
public class A395943 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  // The memo is used for efficiency, small values will work but take longer
  // This default value is enough to do a(9) with complete memo
  private final int mMemoSize = Integer.parseInt(System.getProperty("oeis.memo", "76923053"));
  private final Map<Z, Z> mMemo = new LinkedHashMap<>(1 << 20, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(final Map.Entry<Z, Z> eldest) {
      return size() > mMemoSize;
    }
  };
  private int mN = -1;
  private int[] mPrimes;

  /**
   * Recursive memoized search.
   * @param board occupancy bitboard
   * @param pos lower bound on next empty position
   * @return number of completions
   */
  private Z search(final Z board, int pos, final int usedCount) {
    // completely tiled
    if (usedCount == mN * mN) {
      return Z.ONE;
    }
    final double frac = usedCount / (double) (mN * mN);
    final boolean useCache = frac >= 0.15 && frac <= 0.85;
    if (useCache) {
      final Z cached = mMemo.get(board);
      if (cached != null) {
        return cached;
      }
    }

    while (board.testBit(pos)) {
      ++pos;
    }

    final int r = pos / mN;
    final int c = pos % mN;
    Z total = Z.ZERO;

    // Try every prime length that can fit
    for (final int p : mPrimes) {
      // Horizontal placement
      if (c + p <= mN) {
        final Z mask = Z.valueOf((1L << p) - 1).shiftLeft(pos);
        if (board.and(mask).isZero()) {
          total = total.add(search(board.or(mask), pos + p, usedCount + p));
        }
      }
      // Vertical placement
      if (r + p <= mN) {
        Z mask = Z.ZERO;
        for (int k = 0; k < p; ++k) {
          mask = mask.setBit(pos + k * mN);
        }
        if (board.and(mask).isZero()) {
          total = total.add(search(board.or(mask), pos + 1, usedCount + p));
        }
      }
    }

    if (useCache) {
      mMemo.put(board, total);
    }
    return total;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }

    // Set up for n, clear the memory, determine allowed primes
    mMemo.clear();
    mPrimes = new int[Functions.PRIME_PI.i(mN)];
    mPrimes[0] = 2;
    for (int k = 1; k < mPrimes.length; ++k) {
      mPrimes[k] = Functions.NEXT_PRIME.i(mPrimes[k - 1]);
    }

    // Run the search
    final Z res = search(Z.ZERO, 0, 0);
    if (mVerbose) {
      StringUtils.message("Memo size: " + mMemo.size());
    }
    return res;
  }
}
