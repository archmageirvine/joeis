package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401863 a(n) = Sum_{d|n, d&gt;1} pi(d-1), where pi = A000720.
 * @author Sean A. Irvine
 */
public class A401863 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.PRIME_PI.z(d - 1));
  }
}
