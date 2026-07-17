package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397616 a(n) = prime(floor(n*r)), where r = (5 + sqrt(5))/4.
 * @author Sean A. Irvine
 */
public class A397616 extends Sequence1 {

  private static final CR C = CR.FIVE.add(CR.FIVE.sqrt()).divide(4);
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(C.multiply(++mN).floor());
  }
}
