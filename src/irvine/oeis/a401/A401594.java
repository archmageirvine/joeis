package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A401594 Square array read by antidiagonals upwards: T(n,k) is the n-th prime that does not contain the string "k", with n &gt;= 1, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A401594 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  private long t(final long col) {
    final String s = String.valueOf(col);
    do {
      mA.set(col, mPrime.nextPrime(mA.get(col)));
    } while (String.valueOf(mA.get(col)).contains(s));
    return mA.get(col);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM));
  }
}
