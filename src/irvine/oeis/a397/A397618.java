package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397618 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397618 extends Sequence1 {

  private static final CR C = CR.E.divide(CR.E.subtract(1));
  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME.z(C.multiply(++mN).floor());
  }
}

