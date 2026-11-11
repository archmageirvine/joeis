package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399476 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399476 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.LPF.z(Z.THREE.pow(++mN).subtract(1).divide2());
  }
}
