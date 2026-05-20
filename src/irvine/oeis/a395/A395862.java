package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395862 allocated for Petro Kolosov.
 * @author Sean A. Irvine
 */
public class A395862 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(Rationals.SINGLETON.sum(0, mM, j -> new Q(mM - 2 * j, 2).pow(mN).multiply(Binomial.binomial(mM, j).multiply(Z.NEG_ONE.pow(j)))).divide(Functions.FACTORIAL.z(mM)));
  }
}
