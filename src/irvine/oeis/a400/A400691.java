package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014103;
import irvine.oeis.a104.A104794;

/**
 * A400691 a(n) = c_4(n)/n, where c_4(n) are the Fourier coefficients of the level-2 K3 meromorphic modular form C_4 defined below.
 * @author Sean A. Irvine
 */
public class A400691 extends Sequence1 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> T = SQ.shift(Series.create(new A014103()), 1);
  private static final Series<Q> H = Series.create(new A104794());
  private static final Series<Q> S = SQ.divide(SQ.multiply(SQ.pow(H, 4), T), SQ.add(SQ.one(), SQ.multiply(T, Q.valueOf(64))));

  private long mN = 0;

  @Override
  public Z next() {
    return S.coeff(++mN).divide(mN).toZ();
  }
}
