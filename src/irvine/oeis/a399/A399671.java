package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399671 Smallest number k of the form lpf(k)^n * q(k) * rad(k) such that A008479(k) = 3*n+2, where q(k) is the second smallest distinct prime factor of k and rad = A007947.
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
