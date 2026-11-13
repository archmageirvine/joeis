package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a187.A187256;
import irvine.oeis.gf.GfSequence;

/**
 * A400355 First column of the derivative-compositional Riordan array psi_2(f) = (f^[2](x)*(f^[2])'(x)/x, f^[2](x)), where f^[2](x) = f(f(x)), f(x) = x*s(x), and s(x) is the g.f. of A004148 (RNA secondary structures).
 * @author Sean A. Irvine
 */
public class A400355 extends GfSequence {

  private static final Series<Q> G = Series.create(new A187256());

  /** Construct the sequence. */
  public A400355() {
    super(0, SQ.multiply(SQ.shift(SQ.diff(SQ.square(SQ.shift(G, 1))), -1), Q.HALF));
  }
}
