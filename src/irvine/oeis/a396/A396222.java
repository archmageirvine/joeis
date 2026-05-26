package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396222 a(n) = T(n, n + 2), where T(n, m) is the forward-difference table of the Catalan numbers.
 * @author Sean A. Irvine
 */
public class A396222 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(Functions.CATALAN.z(mN + 2 + k)).multiply(Z.NEG_ONE.pow(mN - k)));
  }
}
