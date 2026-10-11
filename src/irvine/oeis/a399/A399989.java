package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A399989 allocated for Sivaramakrishnan Sivasubramanian.
 * @author Sean A. Irvine
 */
public class A399989 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private static final Series<Q> SQRT = SQ.sqrt(Series.create(Arrays.asList(Q.ONE, Q.valueOf(-4))));

  /** Construct the sequence. */
  public A399989() {
    super(0, SQ.divide(SQ.subtract(SQ.multiply(SQRT, Q.THREE), SQ.one()), SQ.subtract(SQ.multiply(SQRT, Q.TWO), SQ.monomial(Q.FOUR, 1))));
  }
}
