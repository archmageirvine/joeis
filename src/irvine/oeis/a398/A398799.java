package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A398799 Start with a list of positive integers, L. At step n, swap L(n) with the least multiple of L(n)+1 that has not previously been used as a swap target. The sequence consists of the successive swap targets divided by 2.
 * @author Sean A. Irvine
 */
public class A398799 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;

  private long get(final long k) {
    final long v = mA.get(k);
    if (v == 0) {
      mA.set(k, k);
      return k;
    }
    return v;
  }

  @Override
  public Z next() {
    final long m = get(++mN) + 1;
    long k = m;
    while (mUsed.isSet(k)) {
      k += m;
    }
    mUsed.set(k);
    final long t = get(k);
    mA.set(k, m - 1);
    mA.set(mN, t);
    return Z.valueOf(t / 2);
  }
}
