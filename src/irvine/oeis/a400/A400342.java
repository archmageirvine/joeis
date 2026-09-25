package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.EgfSequence;

/**
 * A400342 Expansion of e.g.f. 1 / (1 + x)^tan(x).
 * @author Sean A. Irvine
 */
public class A400342 extends EgfSequence {

  private static final Series<Q> TAN = RationalSeriesEnum.TAN.s();
  private static final Series<Q> DEN = RationalSeriesEnum.EXP.s(SeriesRing.SQ.multiply(RationalSeriesEnum.LOG1P.s(), TAN));

  /** Construct the sequence. */
  public A400342() {
    super(0, SQ.divide(SQ.one(), DEN));
  }
}
