package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397372 Decimal expansion of Sum_{k&gt;=1} (zeta(2) - H(2*k,2))*H(k)/k, where H(k) = A001008(k)/A002805(k) is the k-th harmonic number, and H(k,2) = A007406(k)/A007407(k) is the k-th generalized harmonic number of order 2.
 * @author Sean A. Irvine
 */
public class A397372 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private long mN = -1;
  private final Series<Q> mS = SQ.pow(Hypergeometric.s(new Q[] {Q.ONE_QUARTER, Q.ONE_QUARTER}, new Q[] {Q.ONE}, SQ.x()), 4);

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Z.ONE.shiftLeft(6 * mN)).floor();
  }
}
