package irvine.oeis.a402;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.a002.A002899;
import irvine.oeis.gf.GfSequence;

/**
 * A402231 allocated for James Baker.
 * @author Sean A. Irvine
 */
public class A402231 extends GfSequence {

  private static final Series<Q> F = Series.create(new A002899());
  private static final Series<Q> DP = SQ.create(Q.ONE, Q.ZERO, Q.valueOf(11));
  private static final Series<Q> DM = SQ.create(Q.ONE, Q.ZERO, Q.valueOf(-11));
  private static final Series<Q> S1 = SQ.divide(SQ.monomial(Q.TEN, 2), SQ.oneMinusXToTheN(2));
  private static final Series<Q> S2 = SQ.divide(SQ.monomial(Q.valueOf(22), 2), DP);
  private static final Series<Q> S3 = SQ.multiply(SQ.divide(DM, DP), SQ.subtract(SQ.substitute(F, SQ.divide(SQ.x(), DP)), SQ.one()));

  /** Construct the sequence. */
  public A402231() {
    super(1, SQ.add(SQ.subtract(S1, S2), S3));
  }
}
