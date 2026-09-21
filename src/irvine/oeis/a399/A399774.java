package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a076.A076435;

/**
 * A399774 Number of nonisomorphic primitive strongly regular graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A399774 extends A076435 {

  @Override
  public Z next() {
    return super.next().add(mN == 1 ? 1 : 2).subtract(Functions.SIGMA0.z(mN).multiply2());
  }
}
