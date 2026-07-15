package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397468 a(n) = prime(floor(n*sqrt(3))).
 * @author Sean A. Irvine
 */
public class A397468 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(SQRT3.multiply(++mN).floor());
  }
}
