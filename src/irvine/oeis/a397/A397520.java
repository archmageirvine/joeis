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

  // WIP

  private static class Row {
    long mBits;
    Map<Integer, Byte> mDegree;

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
        mDegree.put(b, (byte) 0);
        x &= x - 1;
      }
    }

    boolean hasBit(final int bit) {
      return bit >= 0 && bit < Long.SIZE && mDegree.containsKey(bit);
    }

    int markMatched(final int bit) {
      final Byte d = mDegree.get(bit);
      if (d == null) {
        return 0;              // no bit here
      }
      if (d != 0) {
        return 2;              // already matched
      }
      mDegree.put(bit, (byte) 1);
      return 1;                // newly matched
    }

    boolean allMatched() {
      for (final byte d : mDegree.values()) {
        if (d != 1) {
          return false;
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return Long.toBinaryString(mBits) + " " + mDegree;
    }
  }


  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private Row mA = null;
  private Row mB = null;

  private static boolean tryMatch(final Row x, final int bx,
                                  final Row y, final int by) {
    if (!y.hasBit(by)) {
      return true;
    }
    if (x.markMatched(bx) != 1) {
      return false;
    }
    return y.markMatched(by) == 1;
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
    return a.allMatched();
  }

  private void accept(final long k) {
    final Row c = new Row(k);
    process(mA, mB, c);   // should always succeed
    mUsed.set(k);
    mA = mB;
    mB = c;
  }

  private boolean ok(final long k) {
    return process(new Row(mA), new Row(mB), new Row(k));
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
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      //System.out.println("Consider " + k + " " + ok(k));
      if (!mUsed.isSet(k) && ok(k)) {
        accept(k);
        System.out.println(k + " " + Long.toBinaryString(k) + " " + mA + " " + mB);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
