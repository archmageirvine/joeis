package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A397571 allocated for Joesph Daniel Burke III.
 * @author Sean A. Irvine
 */
public class A397571 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.equals(Z.THREE) ? Z.THREE : p.mod(6) == 1 ? p.multiply2().subtract(1) : p.subtract(1);
  }
}
