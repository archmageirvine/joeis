package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.ProxySeries;
import irvine.math.series.Series;
import irvine.oeis.a000.A000598;
import irvine.oeis.gf.GfSequence;

/**
 * A400923 Number of achiral n-carbon alkyl radicals C(n)H(2n+1) ignoring stereoisomers.
 * @author Sean A. Irvine
 */
public class A400923 extends GfSequence {

  private static final ProxySeries<Q> A_SERIES = Series.createProxy();
  private static final Series<Q> B2 = SQ.substitute(Series.create(new A000598()), 2);

  /** Construct the sequence. */
  public A400923() {
    super(0, A_SERIES);
    A_SERIES.set(SQ.add(SQ.one(), SQ.shift(SQ.multiply(A_SERIES, B2), 1)));
  }
}
