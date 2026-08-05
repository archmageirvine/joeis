package irvine.oeis.a398;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A398183 a(n) = second-smallest prime p &lt;= n such that 2n - p is also prime, or 0 if fewer than two such primes exist.
 * @author Sean A. Irvine
 */
public class A398183 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    boolean seen = false;
    long p = 2;
    while (p <= mN) {
      if (mPrime.isPrime(2 * mN - p)) {
        if (seen) {
          return Z.valueOf(p);
        }
        seen = true;
      }
      p = mPrime.nextPrime(p);
    }
    return Z.ZERO;
  }
}
