package irvine.oeis.a402;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A402117 a(n) = Sum of the n-th row of a triangle whose n-th row consists of the n smallest available primes, where the k-th prime is removed after appearing in k rows.
 * @author Sean A. Irvine
 */
public class A402117 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mP = 2;
  private long mPi = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mCounts.get(mPi) == mPi) {
      mP = mPrime.nextPrime(mP);
      ++mPi;
    }
    Z sum = Z.ZERO;
    for (long m = 0, q = mP, qi = mPi; m < mN; ++m, q = mPrime.nextPrime(q), ++qi) {
      mCounts.increment(qi);
      sum = sum.add(q);
    }
    return sum;
  }
}
