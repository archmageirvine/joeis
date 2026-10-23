package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401122 a(n) is the size of the annular Jones monoid of degree n.
 * @author Sean A. Irvine
 */
public class A401122 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN - 1, (mN - 1) / 2).square().multiply(mN).add(Z.ONE.add(Z.NEG_ONE.pow(mN)).multiply(Functions.CATALAN.z(mN / 2).square()).divide2());
  }
}

