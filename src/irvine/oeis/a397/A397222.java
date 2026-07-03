package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397222 Number of satisfiable 3-SAT formulas with 2 variables and n clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A397222 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 15, mN).multiply(4)
      .subtract(Binomial.binomial(mN + 12, mN).multiply(4))
      .subtract(Binomial.binomial(mN + 11, mN).multiply2())
      .add(Binomial.binomial(mN + 9, mN).multiply(4))
      .subtract(Binomial.binomial(mN + 7, mN));
  }
}
