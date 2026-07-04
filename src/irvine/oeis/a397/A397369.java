package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397369 allocated for Alex Shvets.
 * @author Sean A. Irvine
 */
public class A397369 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private long mN = -1;
  private final Series<Q> mS = SQ.pow(Hypergeometric.s(new Q[] {Q.ONE_QUARTER, Q.ONE_QUARTER}, new Q[] {Q.ONE}, SQ.x()), 3);

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Z.ONE.shiftLeft(6 * mN)).floor();
  }
}
