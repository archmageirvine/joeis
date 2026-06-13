package irvine.oeis.a396;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A396687 Smallest k &gt; 0 such that 2*prime(n) - prime(n-k) is prime.
 * @author Sean A. Irvine
 */
public class A396687 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 0;
    long q = mP;
    while (true) {
      ++k;
      q = mPrime.prevPrime(q);
      if (mPrime.isPrime(2 * mP - q)) {
        return Z.valueOf(k);
      }
    }
  }
}

