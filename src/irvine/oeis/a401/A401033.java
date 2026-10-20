package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401033 allocated for Jean-Marc Rebert.
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
