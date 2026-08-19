package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396991 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A396991 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    Z q = p;
    for (int k = 0; k < s.length(); ++k) {
      q = mPrime.nextPrime(q);
      if (s.charAt(k) != '0' && !new Z(s.charAt(k) + q.toString()).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
