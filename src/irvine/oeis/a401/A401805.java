package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A401805 allocated for Serhat G\u00fcven.
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
