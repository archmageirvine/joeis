package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.ProxySeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A400497.
 * @author Sean A. Irvine
 */
public class A400497 extends GfSequence {

  private static final ProxySeries<Q> SERIES = Series.createProxy();

  /** Construct the sequence. */
  public A400497() {
    super(0, SERIES);
    // A(x) = 1/(1 - x * A(x^4))^2
    SERIES.set(SQ.divide(SQ.one(), SQ.square(SQ.subtract(SQ.one(), SQ.shift(SQ.substitute(SERIES, 4), 1)))));
  }
}

