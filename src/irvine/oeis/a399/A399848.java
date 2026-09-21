package irvine.oeis.a399;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399848 Triangle read by rows: T(n,k) = n! * [x^n] log(x+1)^k/(k*(1 - log(x+1))^(k+1)), with 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A399848 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private long mN = 0;
  private long mM = 0;
  private final MemoryFunction1<Series<Q>> mS = new MemoryFunction1<>() {
    @Override
    protected Series<Q> compute(final int k) {
      if (k < 1) {
        return null;
      }
      final Series<Q> num = SQ.pow(RationalSeriesEnum.LOG1P.s(), k);
      final Series<Q> den = SQ.multiply(SQ.pow(SQ.subtract(SQ.one(), RationalSeriesEnum.LOG1P.s()), k + 1), Q.valueOf(k));
      return SQ.divide(num, den);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mS.get(mM).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
