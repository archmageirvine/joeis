package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A397846 allocated for Joesph Daniel Burke III.
 * @author Sean A. Irvine
 */
public class A397846 extends GfSequence {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  /** Construct the sequence. */
  public A397846() {
    super(0, new AbstractInfiniteSeries<>() {
      private Series<Q> mS = SQ.one();
      private Series<Q> mP = SQ.one();
      private long mR = 0;
      @Override
      public Q coeff(final long n) {
        final long r = Functions.SQRT.l(n);
        while (r > mR) {
          mP = SQ.multiply(mP, SQ.square(SQ.onePlusXToTheN(++mR)));
          mS = SQ.signedAdd((mR & 1) == 0, mS, SQ.divide(SQ.monomial(mR * mR), mP));
        }
        return mS.coeff(n);
      }
    });
  }
}

