package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.ProxySeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A400922 Number of monosubstituted acyclic hydrocarbons (alkanes and olefins), taking stereoisomers into account.
 * @author Sean A. Irvine
 */
public class A400922 extends GfSequence {

  private static final ProxySeries<Q> SERIES = Series.createProxy();

  /** Construct the sequence. */
  public A400922() {
    super(0, SERIES);
    // A(x) = 1 + x*((1 + 3*x)*A(x)^3 + 2*A(x^3))/3.
    final Series<Q> s1 = SQ.multiply(SQ.onePlusXToTheN(Q.THREE, 1), SQ.multiply(SQ.multiply(SERIES, SERIES), SERIES));
    final Series<Q> s3 = SQ.multiply(SQ.substitute(SERIES, 3), Q.TWO);
    SERIES.set(SQ.add(SQ.one(), SQ.divide(SQ.shift(SQ.add(s1, s3), 1), Q.THREE)));
  }
}

