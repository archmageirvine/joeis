package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397615 a(n) = prime(floor(n*sqrt(5))).
 * @author Sean A. Irvine
 */
public class A397615 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(SQRT5.multiply(++mN).floor());
  }
}
