package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401434 allocated for Hector Yan Estivel.
 * @author Sean A. Irvine
 */
public class A401434 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1).square().multiply(3).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

