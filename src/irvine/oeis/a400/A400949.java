package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a002.A002895;
import irvine.oeis.gf.GfSequence;

/**
 * A400949 Number of closed non-backtracking walks of length 2n (cyclically non-backtracking, i.e., tailless) starting and ending at a fixed atom of the diamond network.
 * @author Sean A. Irvine
 */
public class A400949 extends GfSequence {

  private static Series<Q> build() {
    final Series<Q> d = Series.create(new A002895());
    final Series<Q> tm = SQ.oneMinusXToTheN(Q.THREE, 1);
    final Series<Q> tp = SQ.onePlusXToTheN(Q.THREE, 1);
    final Series<Q> ds1 = SQ.subtract(SQ.substitute(d, SQ.divide(SQ.x(), SQ.square(tp))), SQ.one());
    final Series<Q> r = SQ.divide(tm, tp);
    final Series<Q> a = SQ.divide(SQ.multiply(SQ.x(), Q.TWO), SQ.oneMinusXToTheN(1));
    final Series<Q> b = SQ.divide(SQ.multiply(SQ.x(), Q.SIX), tp);
    return SQ.add(SQ.subtract(a, b), SQ.multiply(r, ds1));
  }

  /** Construct the sequence. */
  public A400949() {
    super(1, build());
  }
}
