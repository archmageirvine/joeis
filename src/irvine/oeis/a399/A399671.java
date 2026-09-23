package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399671 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399671 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN < 4
      ? Z.NINE.shiftLeft(mN + 1)
      : Functions.PRIME.z(Functions.PRIME_PI.l(Functions.SQRT.l(Z.ONE.shiftLeft(mN))) + 1).square().shiftLeft(mN + 1);
  }
}
