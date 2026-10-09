package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399287 allocated for Om S. M. Yadav.
 * @author Sean A. Irvine
 */
public class A399287 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      if (p.add(q.multiply(r).multiply2()).isProbablePrime() && q.add(p.multiply(r).multiply2()).isProbablePrime() && r.add(p.multiply(q).multiply2()).isProbablePrime()) {
        return p;
      }
    }
  }
}
