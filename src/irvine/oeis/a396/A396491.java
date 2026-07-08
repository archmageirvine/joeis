package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396491 Number of unsatisfiable 3-SAT formulas with n variables and 5 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A396491 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 1).multiply(20)
      .add(Binomial.binomial(mN, 2).multiply(6720))
      .add(Binomial.binomial(mN, 3).multiply(224102))
      .add(Binomial.binomial(mN, 4).multiply(1766568))
      .add(Binomial.binomial(mN, 5).multiply(6055360))
      .add(Binomial.binomial(mN, 6).multiply(13099520))
      .add(Binomial.binomial(mN, 7).multiply(17940160))
      .add(Binomial.binomial(mN, 8).multiply(15088640))
      .add(Binomial.binomial(mN, 9).multiply(7096320))
      .add(Binomial.binomial(mN, 10).multiply(1433600));
  }
}
