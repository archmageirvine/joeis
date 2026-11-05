package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A401404 allocated for Vincenzo Manto.
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

