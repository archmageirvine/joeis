package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.a001.A001190;
import irvine.oeis.gf.GfSequence;

/**
 * A397961 Number of rooted binary unlabeled simplex time-consistent galled trees with n leaves and exactly 1 gall.
 * @author Sean A. Irvine
 */
public class A397961 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private static Series<Q> build() {
    final Series<Q> a = Series.create(new A001190());
    final Series<Q> a2 = SQ.substitute(a, 2);
    final Series<Q> a1 = SQ.subtract(SQ.one(), a);
    final Series<Q> s0 = SQ.divide(SQ.square(a), SQ.pow(a1, 3));
    final Series<Q> s1 = SQ.divide(a2, SQ.multiply(a1, SQ.subtract(SQ.one(), a2)));
    return SQ.multiply(SQ.shift(SQ.add(s0, s1), 1), Q.HALF);
  }

  /** Construct the sequence. */
  public A397961() {
    super(0, build());
  }
}

