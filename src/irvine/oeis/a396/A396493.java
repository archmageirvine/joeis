package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A396493 Number of satisfiable 3-SAT formulas with n variables and 4 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A396493 extends A396354 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(Binomial.binomial(2 * ++mN + 2, 3).add(3), 4).subtract(super.next());
  }
}
