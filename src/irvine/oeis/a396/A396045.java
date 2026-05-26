package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396045 a(n) = T(n, 2*n), where T(n, m) is the forward-difference table of the Catalan numbers.
 * @author Sean A. Irvine
 */
public class A396045 extends Sequence0 {

  private long mN = -1;

  // a(n) = Sum_{k=0..n} (-1)^(n - k)*binomial(n, k)*A000108(2*n + k).

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Z.NEG_ONE.pow(mN - k).multiply(Binomial.binomial(mN, k)).multiply(Functions.CATALAN.z(2 * mN + k)));
  }
}
