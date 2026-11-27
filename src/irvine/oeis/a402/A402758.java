package irvine.oeis.a402;

import irvine.math.series.Series;
import irvine.oeis.a028.A028959;
import irvine.oeis.gf.GfSequence;

/**
 * A402207.
 * @author Sean A. Irvine
 */
public class A402758 extends GfSequence {

  /** Construct the sequence. */
  public A402758() {
    super(0, SQ.pow(Series.create(new A028959()), 8));
  }
}
