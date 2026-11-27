package irvine.oeis.a402;

import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.oeis.a397.A397712;
import irvine.oeis.gf.EgfSequence;

/**
 * A402465 allocated for Tyler Satchel Orden.
 * @author Sean A. Irvine
 */
public class A402465 extends EgfSequence {

  /** Construct the sequence. */
  public A402465() {
    super(1, RationalSeriesEnum.LOG1P.s(SQ.subtract(Series.createEgf(new A397712()), SQ.one())));
  }
}
