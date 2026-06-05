package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396532 First column of the triangular array with T(0, m) = binomial(2*m, m) and T(n, m) = T(n - 1, m + 3) - T(n - 1, m + 2).
 * @author Sean A. Irvine
 */
public class A396532 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * (2 * mN + k), 2 * mN + k)).multiply(Z.NEG_ONE.pow(mN - k)));
  }
}

