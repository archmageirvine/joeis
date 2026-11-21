package irvine.oeis.a400;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400895 Number of odd primes p &lt; 2n such that 2n - p is not prime and 4n - p is prime, for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A400895 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long p = 3;
    while (p < 2 * mN) {
      if (!mPrime.isPrime(2 * mN - p) && mPrime.isPrime(4 * mN - p)) {
        ++cnt;
      }
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}
