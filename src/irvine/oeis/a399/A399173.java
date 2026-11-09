package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a004.A004148;
import irvine.oeis.gf.GfSequence;

/**
 * A399173 First column of the derivative-compositional Riordan array psi_1(f) = (f^[1](x)*(f^[1])'(x)/x, f^[1](x)) = (f(x)*f'(x)/x, f(x)), where f(x) = x*s(x) and s(x) is the g.f. of A004148 (RNA secondary structures).
 * @author Sean A. Irvine
 */
public class A399173 extends GfSequence {

  private static final Series<Q> S = Series.create(new A004148());

  /** Construct the sequence. */
  public A399173() {
    super(0, SQ.multiply(SQ.shift(SQ.diff(SQ.square(SQ.shift(S, 1))), -1), Q.HALF));
  }
}

