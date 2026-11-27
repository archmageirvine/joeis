package irvine.oeis.a402;

import irvine.math.series.Series;
import irvine.oeis.a028.A028930;
import irvine.oeis.a028.A028959;
import irvine.oeis.gf.GfSequence;

/**
 * A402729 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A402729 extends GfSequence {

  /** Construct the sequence. */
  public A402729() {
    super(0, SQ.multiply(SQ.pow(Series.create(new A028930()), 6), SQ.square(Series.create(new A028959()))));
  }
}
