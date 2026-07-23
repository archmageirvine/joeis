package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396907 allocated for Thomas Scheuerle.
 * @author Sean A. Irvine
 */
public class A396907 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> HALFX = SQ.monomial(Q.HALF, 1);
  private final Series<Q> mTanU = RationalSeriesEnum.TAN.s(SQ.add(HALFX, RationalSeriesEnum.LOG1P.s(SQ.subtract(RationalSeriesEnum.COSH.s(HALFX), SQ.one()))));
  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    if (n < 1) {
      return Z.ZERO;
    }
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("t", Rationals.SINGLETON, n);
    final PolynomialRingField<Polynomial<Q>> fld = new PolynomialRingField<>(inner);
    // Promote tan(x) to fld
    final Polynomial<Polynomial<Q>> promote = fld.empty();
    for (int k = 0; k < n; ++k) {
      promote.add(Polynomial.create(mTanU.coeff(k)));
    }
    final Polynomial<Polynomial<Q>> s1 = fld.series(fld.add(fld.monomial(inner.x(), 0), promote), fld.subtract(fld.one(), fld.multiply(promote, inner.x())), n);
    return s1.coeff(n - 1).coeff(m).multiply(Functions.FACTORIAL.z(n - 1)).multiply(Z.ONE.shiftLeft(n - 1)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

