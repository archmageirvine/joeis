package irvine.oeis.a397;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A397520 allocated for Scott R. Shannon.
 * @author Sean A. Irvine
 */
public class A397520 extends Sequence0 {

  private static final int NO_BIT = 0;
  private static final int MATCHED = 1;
  private static final int ALREADY_MATCHED = 2;
  private static final long STUCK = -1;

  // Lookahead of 2 is enough for the influence of a newly created knight to disappear
  // (note this search ahead depth is independent of mA, mB previous rows)
  private static final int LOOKAHEAD = 2;

  private static final class Row {
    private final long mBits;
    private final Map<Integer, Byte> mDegree;

    private Row(final Row row) {
      mBits = row.mBits;
      mDegree = new HashMap<>(row.mDegree);
    }

    private Row(final long bits) {
      mBits = bits;
      mDegree = new HashMap<>();
      long x = mBits;
      while (x != 0) {
        final int b = Long.numberOfTrailingZeros(x);
        mDegree.put(b, (byte) NO_BIT);
        x &= x - 1;
      }
    }

    private boolean hasBit(final int bit) {
      return bit >= NO_BIT && bit < Long.SIZE && mDegree.containsKey(bit);
    }

    private int markMatched(final int bit) {
      final Byte d = mDegree.get(bit);
      if (d == null) {
        return NO_BIT;
      }
      if (d != NO_BIT) {
        return ALREADY_MATCHED;
      }
      mDegree.put(bit, (byte) MATCHED);
      return MATCHED;
    }

    private boolean allMatched() {
      for (final byte d : mDegree.values()) {
        if (d != 1) {
          return false;
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return mBits + " " + Long.toBinaryString(mBits) + " " + mDegree;
    }
  }

  // Overall tracking of used values
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;

  // Previous two rows (the only rows that can contain unmatched knights)
  private Row mA = null;
  private Row mB = null;

  private static boolean isBlocked(final Row a, final Row b) {
    for (final Map.Entry<Integer, Byte> e : a.mDegree.entrySet()) {
      if (e.getValue() == NO_BIT) {
        // We have an unmatched knight in a that we must match
        final int pos = e.getKey();
        if (
          // try pos+1
          (pos >= Long.SIZE || b.mDegree.containsKey(pos - 1) || b.mDegree.containsKey(pos + 3) || a.mDegree.containsKey(pos + 2))
            // try pos-1
            && (pos <= 0 || b.mDegree.containsKey(pos + 1) || b.mDegree.containsKey(pos - 3) || a.mDegree.containsKey(pos - 2))
        ) {
          // A knight in b prevents us from matching the knight in row a
          return true;
        }
      }
    }
    return false;
  }

  private static boolean tryMatch(final Row x, final int bx, final Row y, final int by) {
    if (!y.hasBit(by)) {
      return true;
    }
    if (x.markMatched(bx) != MATCHED) {
      return false;
    }
    return y.markMatched(by) == MATCHED;
  }

  private boolean process(final Row a, final Row b, final Row c) {
    long x = c.mBits;
    while (x != 0) {
      final int bit = Long.numberOfTrailingZeros(x);
      if (!tryMatch(c, bit, b, bit - 2)) {
        return false;
      }
      if (!tryMatch(c, bit, b, bit + 2)) {
        return false;
      }
      if (!tryMatch(c, bit, a, bit - 1)) {
        return false;
      }
      if (!tryMatch(c, bit, a, bit + 1)) {
        return false;
      }
      x &= x - 1;
    }
    return a.allMatched() && !isBlocked(b, c);
  }

  private void accept(final long k) {
    final Row c = new Row(k);
    if (!process(mA, mB, c)) {
      // This should never happen because we already checked k is valid
      throw new RuntimeException();
    }
    mUsed.set(k);
    mA = mB;
    mB = c;
  }

  private long extend(final Row a, final Row b, final int depth) {
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        // Note "process" mutates contents of a and b, so we make copies
        final Row a2 = new Row(a);
        final Row b2 = new Row(b);
        final Row c = new Row(k);
        if (process(a2, b2, c)) {
          if (depth == 1 || extend(b2, c, depth - 1) != STUCK) {
            return k;
          }
        }
      }
      do {
        ++k;
      } while ((k & 0b10101) == 0b10101);
      // Conservative stuck test
      if (k > 8 * mUsed.length()) {
        return STUCK;
      }
    }
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mUsed.set(0);
        mA = new Row(0);
        return Z.ZERO;
      }
      mUsed.set(1);
      mB = new Row(1);
      return Z.ONE;
    }
    //System.out.println(mA + " " + mB + " blocked=" + isBlocked(mA, mB));
    // Numbers ending in 10101 can never be matched
    while (mUsed.isSet(mLeastUnused) || (mLeastUnused & 0b10101) == 0b10101) {
      ++mLeastUnused;
    }
    final long k = extend(mA, mB, LOOKAHEAD);
    if (k == STUCK) {
      throw new RuntimeException();
    }
    accept(k);
    return Z.valueOf(k);
  }
}
