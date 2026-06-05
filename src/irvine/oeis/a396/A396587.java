package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A396587 a(n) / (4*n!) is the cubic moment of the Farey series of order n.
 * @author Sean A. Irvine
 */
public class A396587 extends A006842 {

  private long mN = 0;

  @Override
  public Z next() {
    step();
    Q sum = Q.ZERO;
    for (final Q v : mTerms) {
      sum = sum.add(v.pow(3));
    }
    return sum.multiply(4).multiply(Functions.FACTORIAL.z(++mN)).toZ();
  }
}
