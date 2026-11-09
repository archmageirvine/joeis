package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A401404 Numbers m such that pi(2*m) is prime, where pi is A000720.
 * @author Sean A. Irvine
 */
public class A401404 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      super.next();
      if (super.next().isProbablePrime()) {
        return mN.divide2();
      }
    }
  }
}

