package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.EgfSequence;

/**
 * A399237 Expansion of e.g.f. 1 / (1 + x)^tanh(x).
 * @author Sean A. Irvine
 */
public class A399237 extends EgfSequence {

  private static final Series<Q> TANH = RationalSeriesEnum.TANH.s();
  private static final Series<Q> DEN = RationalSeriesEnum.EXP.s(SeriesRing.SQ.multiply(RationalSeriesEnum.LOG1P.s(), TANH));

  /** Construct the sequence. */
  public A399237() {
    super(0, SQ.divide(SQ.one(), DEN));
  }
}
