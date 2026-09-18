package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a076.A076435;

/**
 * A399774 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399774 extends A076435 {

  @Override
  public Z next() {
    return super.next().add(2).subtract(Functions.SIGMA0.z(mN).multiply2());
  }
}
