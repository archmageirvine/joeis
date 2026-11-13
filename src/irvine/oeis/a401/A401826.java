package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401826 a(n) = Sum_{d|n, d&gt;1} d * pi(d-1) for n&gt;=1, where pi = A000720.
 * @author Sean A. Irvine
 */
public class A401826 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d == 1 ? Z.ZERO : Functions.PRIME_PI.z(d - 1).multiply(d));
  }
}
