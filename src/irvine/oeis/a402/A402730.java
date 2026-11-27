package irvine.oeis.a402;

import irvine.math.series.Series;
import irvine.oeis.a028.A028930;
import irvine.oeis.a028.A028959;
import irvine.oeis.gf.GfSequence;

/**
 * A402730 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A402730 extends GfSequence {

  /** Construct the sequence. */
  public A402730() {
    super(0, SQ.multiply(SQ.pow(Series.create(new A028930()), 5), SQ.pow(Series.create(new A028959()), 3)));
  }
}
