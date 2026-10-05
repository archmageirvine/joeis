package irvine.oeis.a397;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400199.
 * @author Sean A. Irvine
 */
public class A397526 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    long cnt = 0;
    for (long p = 3; p < mN; p = mPrime.nextPrime(p)) {
      if (p == 3 || p % 3 == 2) {
        final long q = mN - p;
        if (mPrime.isPrime(q) && mPrime.isPrime(4 * q + 1) && mPrime.isPrime(2 * p + 1)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

