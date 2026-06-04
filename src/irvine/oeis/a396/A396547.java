package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396547 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A396547 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.SOPF.z(p.subtract(1)).isProbablePrime()) {
        return p;
      }
    }
  }
}
