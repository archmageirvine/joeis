package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.EgfSequence;

/**
 * A400341 Expansion of e.g.f. 1 / (1 + x)^sinh(x).
 * @author Sean A. Irvine
 */
public class A400341 extends EgfSequence {

  private static final Series<Q> SINH = RationalSeriesEnum.SINH.s();
  private static final Series<Q> DEN = RationalSeriesEnum.EXP.s(SeriesRing.SQ.multiply(RationalSeriesEnum.LOG1P.s(), SINH));

  /** Construct the sequence. */
  public A400341() {
    super(0, SQ.divide(SQ.one(), DEN));
  }
}
