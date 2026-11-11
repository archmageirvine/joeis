package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400721 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A400721 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GPF.z(Z.THREE.pow(++mN).subtract(Z.ONE.shiftLeft(mN)));
  }
}
