package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a004.A004148;
import irvine.oeis.gf.GfSequence;

/**
 * A401531 allocated for Akash Suresh.
 * @author Sean A. Irvine
 */
public class A399173 extends GfSequence {

  private static final Series<Q> S = Series.create(new A004148());

  /** Construct the sequence. */
  public A399173() {
    super(0, SQ.multiply(SQ.shift(SQ.diff(SQ.square(SQ.shift(S, 1))), -1), Q.HALF));
  }
}

