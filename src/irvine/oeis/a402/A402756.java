package irvine.oeis.a402;

import irvine.math.series.Series;
import irvine.oeis.a028.A028930;
import irvine.oeis.a028.A028959;
import irvine.oeis.gf.GfSequence;

/**
 * A402207.
 * @author Sean A. Irvine
 */
public class A402756 extends GfSequence {

  /** Construct the sequence. */
  public A402756() {
    super(0, SQ.multiply(SQ.square(Series.create(new A028930())), SQ.pow(Series.create(new A028959()), 6)));
  }
}
