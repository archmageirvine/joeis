package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A402189 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A402189 extends Sequence2 {

  private Z mA = Z.FIVE;

  @Override
  public Z next() {
    mA = mA.multiply(5);
    return Functions.LPF.z(mA.subtract(1).divide(4));
  }
}
