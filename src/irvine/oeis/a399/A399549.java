package irvine.oeis.a399;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399549 allocated for Thomas Scheuerle.
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

