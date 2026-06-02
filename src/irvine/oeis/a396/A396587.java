package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A396587 allocated for Marko Riedel.
 * @author Sean A. Irvine
 */
public class A396587 extends A006842 {

  private long mN = -1;

  {
    setOffset(0);
  }
   // a(n)/4/n! = Sum_{r in F_n} r^3 = 1/2 + 1/4 Sum_{m=1..n} (phi(m)+J(m,-1)) where F_n is the Farey sequence on n, phi is the Euler totient and J is the Jordan totient.

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    step();
    Q sum = Q.ZERO;
    for (final Q v : mTerms) {
      sum = sum.add(v.pow(3));
    }
    return sum.multiply(4).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
