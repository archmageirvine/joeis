package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a396.A396351;

/**
 * A397492 Square array read by antidiagonals: A(n,m) is the number of satisfiable 3-SAT formulas with n variables and m clauses in the multiset clause model, n &gt;= 1, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A397492 extends A396351 {

  @Override
  protected Z t(final int n, final int m) {
    return Binomial.binomial(Binomial.binomial(2L * n + 2, 3).add(m - 1), m).subtract(super.t(n, m));
  }
}
