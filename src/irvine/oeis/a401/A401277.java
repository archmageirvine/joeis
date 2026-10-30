package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401277 allocated for Geoffrey Critzer.
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
