package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397617 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397617 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(CR.E.multiply(++mN).floor());
  }
}

