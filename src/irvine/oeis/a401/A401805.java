package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A401805 Primes p congruent to 1 (mod 6) that cannot be written as k*(k+1) + q, where k is a positive integer and q is the smaller member of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A401805 extends A002476 {

  private final Fast mPrime = new Fast();

  private boolean is(final long p) {
    for (long k = 1, s; (s = k * (k + 1)) < p; ++k) {
      final long q = p - s;
      if (mPrime.isPrime(q) && mPrime.isPrime(q + 2)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!is(p.longValueExact())) {
        return p;
      }
    }
  }
}
