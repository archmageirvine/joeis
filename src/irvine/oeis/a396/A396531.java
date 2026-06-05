package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396531 First column of the triangular array with T(0, m) = binomial(2*m, m)/(m + 1) = A000108(m) and T(n, m) = T(n - 1, m + 3) - 2*T(n - 1, m + 2) + T(n - 1, m + 1).
 * @author Sean A. Irvine
 */
public class A396531 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 2 * ++mN, k -> Z.NEG_ONE.pow(2 * mN - k).multiply(Binomial.binomial(2 * mN, k)).multiply(Binomial.binomial(2 * (mN + k), mN + k)).divide(mN + k + 1));
  }
}
