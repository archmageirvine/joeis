package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401019 allocated for Mykola Filipchuk.
 * @author Sean A. Irvine
 */
public class A401019 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final long pi = Functions.PRIME_PI.l(mN);
    return Functions.FACTORIAL.z(mN - 2).multiply(mN - pi).multiply(mN - pi - 1);
  }
}
