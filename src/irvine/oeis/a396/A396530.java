package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396530 First column of the triangular array with T(0, m) = binomial(2*m, m) and T(n, m) = T(n - 1, m + 3) - 2*T(n - 1, m + 2) + T(n - 1, m + 1).
 * @author Sean A. Irvine
 */
public class A396530 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 2 * ++mN, k -> Binomial.binomial(2 * mN, k).multiply(Binomial.binomial(2 * (mN + k), mN + k)).multiply(Z.NEG_ONE.pow(k)));
  }
}

