package irvine.oeis.a399;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A399699 Decimal expansion of the probability that the cycle-following strategy succeeds in the 100 prisoners problem.
 * @author Sean A. Irvine
 */
public class A399699 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (long p = 3; p < mN; p = mPrime.nextPrime(p)) {
      if (!mPrime.isPrime(mN - p) && mPrime.isPrime(mN + 2 - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
