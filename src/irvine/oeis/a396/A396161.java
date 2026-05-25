package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395765 First column of the triangular array with T(0, m) = m! and T(n, m) = T(n - 1, m + 3) - T(n - 1, m + 2).
 * @author Sean A. Irvine
 */
public class A396161 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Z.NEG_ONE.pow(mN - k).multiply(Binomial.binomial(mN, k)).multiply(Z.valueOf(2 * mN + k).pow(2 * mN + k)));
  }
}
