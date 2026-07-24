package irvine.oeis.a397;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397657 Triangle of triangles T(n,t,c) read by rows: number of functions f:{1..n}-&gt;{1..n} whose functional graph has maximal tail length (rho-height) exactly t and exactly c cyclic (periodic) points; n &gt;= 1, 0 &lt;= t &lt;= n-1, 1 &lt;= c &lt;= n.
 * @author Sean A. Irvine
 */
public class A397657 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final PolynomialRingField<Q> POLYQ = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final SeriesRing<Polynomial<Q>> RING = new SeriesRing<>(POLYQ);
  private final MemoryFunction1<Series<Q>> mE = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int n) {
      return n == 0 ? SQ.x() : SQ.shift(RationalSeriesEnum.EXP.s(get(n - 1)), 1);
    }
  };
  private long mN = 0;
  private long mT = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC > mN) {
      if (++mT >= mN) {
        ++mN;
        mT = 0;
      }
      mC = 1;
    }
    final Polynomial<Q> et = SQ.toPolynomial(mE.get(mT), mN);
    final Polynomial<Q> et1 = mT <= 0 ? POLYQ.zero() : SQ.toPolynomial(mE.get(mT - 1), mN);
    final Q s = RING.divide(RING.one(), RING.oneMinusXToTheN(et, 1)).coeff(mC).coeff(mN);
    final Q t = RING.divide(RING.one(), RING.oneMinusXToTheN(et1, 1)).coeff(mC).coeff(mN);
    return s.subtract(t).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}

