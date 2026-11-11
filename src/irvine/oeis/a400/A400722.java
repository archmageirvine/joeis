package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400722 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A400722 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(Z.ONE.shiftLeft(2 * ++mN).subtract(1).divide(3));
  }
}
