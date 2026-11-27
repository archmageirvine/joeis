package irvine.oeis.a401;

import irvine.math.series.Series;
import irvine.oeis.a028.A028930;
import irvine.oeis.gf.GfSequence;

/**
 * A401430 Expansion of g.f. Phi^8, where Phi = g.f. for A028930.
 * @author Sean A. Irvine
 */
public class A401430 extends GfSequence {

  /** Construct the sequence. */
  public A401430() {
    super(0, SQ.pow(Series.create(new A028930()), 8));
  }
}
