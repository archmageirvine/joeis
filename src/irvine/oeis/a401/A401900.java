package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401900 allocated for Sergii Voloshyn.
 * @author Sean A. Irvine
 */
public class A401900 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Q risingFactorial(final Q x, final long n) {
    final Z p = x.num();
    final Z q = x.den();
    Z numerator = Z.ONE;
    for (long k = 0; k < n; ++k) {
      numerator = numerator.multiply(p.add(q.multiply(k)));
    }
    return new Q(numerator, q.pow(n));
  }

  private Z p(final long n, final long r) {
    return risingFactorial(new Q(2 * r + 1, 2), n)
      .multiply(Functions.RISING_FACTORIAL.z(r + 1, n))
      .multiply(risingFactorial(new Q(2 * r + 3, 2), n))
      .multiply(Z.ONE.shiftLeft(2 * n))
      .divide(Functions.FACTORIAL.z(n))
      .divide(Functions.FACTORIAL.z(n + 1))
      .divide(risingFactorial(new Q(3, 2), n))
      .toZ();
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(3 * mN + 1, j)).multiply(p(mN, mM - j)));
  }
}
