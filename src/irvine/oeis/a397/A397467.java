package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397467 a(n) = prime(2n + floor(n*sqrt(2))).
 * @author Sean A. Irvine
 */
public class A397467 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(CR.SQRT2.multiply(++mN).floor().add(2 * mN));
  }
}
