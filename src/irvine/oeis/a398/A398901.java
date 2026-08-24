package irvine.oeis.a398;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a096.A096960;

/**
 * A398901 a(n) = c_6b(n)/n^2, where c_6b(n) are the Fourier coefficients of the level-2 K3 meromorphic modular form C_6b defined below.
 * @author Sean A. Irvine
 */
public class A398901 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private static Series<Q> build() {
    final Series<Q> b = Series.create(new A096960().prepend(0));
    final Series<Q> prod = new AbstractInfiniteSeries<>() {
      private Series<Q> mS = SQ.one();
      private long mK = 1;
      @Override
      public Q coeff(final long n) {
        while (n >= mK) {
          mS = SQ.multiply(mS, SQ.onePlusXToTheN(mK));
          ++mK;
        }
        return mS.coeff(n);
      }
    };
    final Series<Q> u = SQ.multiply(SQ.shift(SQ.pow(prod, 24), 1), Q.valueOf(64));
    return SQ.divide(SQ.multiply(b, SQ.subtract(SQ.one(), u)), SQ.square(SQ.add(SQ.one(), u)));
  }

  private final Series<Q> mS = build();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.coeff(++mN).divide(mN * mN).toZ();
  }
}
