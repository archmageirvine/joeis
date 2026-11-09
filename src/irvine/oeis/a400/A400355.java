package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a187.A187256;
import irvine.oeis.gf.GfSequence;

/**
 * A400355 allocated for Ifeyinwa Madu.
 * @author Sean A. Irvine
 */
public class A400355 extends GfSequence {

  private static final Series<Q> G = Series.create(new A187256());

  /** Construct the sequence. */
  public A400355() {
    super(0, SQ.multiply(SQ.shift(SQ.diff(SQ.square(SQ.shift(G, 1))), -1), Q.HALF));
  }
}
