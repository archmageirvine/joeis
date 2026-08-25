package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399070 allocated for Thomas Ordowski.
 * @author Sean A. Irvine
 */
public class A399070 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.CARMICHAEL_LAMBDA.z(Z.ONE.shiftLeft(++mN).add(1)).add(1);
  }
}
