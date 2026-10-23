package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401033 Let m = prime(n), then a(n) is the smallest prime p for which (p^m-(q-p)^m)/(2*p-q) is prime where q is the next prime after p; or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A401033 extends A000040 {

  @Override
  public Z next() {
    final Z m = super.next();
    Z p;
    Z q = Z.TWO;
    while (true) {
      p = q;
      q = mPrime.nextPrime(q);
      final Z t = p.pow(m).subtract(q.subtract(p).pow(m)).divide(p.multiply2().subtract(q));
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}
