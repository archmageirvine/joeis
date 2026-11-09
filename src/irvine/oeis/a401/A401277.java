package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401277 Irregular triangular array read by rows. T(n,k) is the number of ways to orient the edges of a simple labeled graph on [n] having exactly k edges so that there are no vertex descents then color the vertices with exactly n colors c1&lt;c2&lt;...&lt;cn so that there are no color descents, 0&lt;=k&lt;=binomial(n,2), n&gt;=0.
 * @author Sean A. Irvine
 */
public class A401277 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> Y1 = RING.onePlusXToTheN(1);

  private Polynomial<Z> mB = RING.one();
  private int mN = 0;
  private int mM = -1;

  /**
   * Multiply by 1 + (1+y) + ... + (1+y)^(n-1).
   * @param a polynomial
   * @param n exponent limit
   * @return product
   */
  private static Polynomial<Z> multiplySum(final Polynomial<Z> a, final int n) {
    Polynomial<Z> sum = RING.zero();
    Polynomial<Z> qPower = RING.one();
    for (int j = 0; j < n; ++j) {
      sum = RING.add(sum, qPower);
      qPower = RING.multiply(qPower, Y1);
    }
    return RING.multiply(a, sum);
  }

  @Override
  public Z next() {
    if (++mM > Functions.BINOMIAL.l(mN, 2)) {
      ++mN;
      mB = multiplySum(mB, mN);
      mM = 0;
    }
    return mB.coeff(mM);
  }
}
