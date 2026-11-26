package irvine.oeis.a401;

import irvine.math.series.Series;
import irvine.oeis.a028.A028930;
import irvine.oeis.a028.A028959;
import irvine.oeis.gf.GfSequence;

/**
 * A402207.
 * @author Sean A. Irvine
 */
public class A401474 extends GfSequence {

  /** Construct the sequence. */
  public A401474() {
    super(0, SQ.multiply(SQ.pow(Series.create(new A028930()), 7), Series.create(new A028959())));
  }
}
