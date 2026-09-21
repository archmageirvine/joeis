package irvine.oeis.a399;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399549 Irregular triangle T(n, k) read by rows. T(n, k) gives the coefficient [t^k] P_{n}(t) from the Somos-4 sequence of polynomials P_{0}(t) = P_{1}(t) = P_{2}(t) = P_{3}(t)=1; for n &gt;= 4, P_{n}(t) = (P_{n-1}(t) * P_{n-3}(t) + t*P_{n-2}(t)^2) / P_{n-4}(t).
 * @author Sean A. Irvine
 */
public class A399549 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Polynomial<Z>> mSomosPolynomials = new ArrayList<>();
  {
    mSomosPolynomials.add(RING.one());
    mSomosPolynomials.add(RING.one());
    mSomosPolynomials.add(RING.one());
    mSomosPolynomials.add(RING.one());
  }

  private int mN = 0;
  private int mM = -1;

  private Polynomial<Z> somos(final int n) {
    while (n >= mSomosPolynomials.size()) {
      final int m = mSomosPolynomials.size();
      mSomosPolynomials.add(RING.divide(RING.add(RING.multiply(somos(m - 1), somos(m - 3)), RING.pow(somos(m - 2), 2).shift(1)), somos(m - 4)));
    }
    return mSomosPolynomials.get(n);
  }

  @Override
  public Z next() {
    if (++mM > somos(mN).degree()) {
      ++mN;
      mM = 0;
    }
    return somos(mN).coeff(mM);
  }
}

