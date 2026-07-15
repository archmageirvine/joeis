package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.oeis.Sequence;
import irvine.oeis.a258.A258400;
import irvine.oeis.gf.GfSequence;

/**
 * A396912 a(n) is the number of partitions of n into parts m^k such that m, k, and m + k are prime.
 * @author Sean A. Irvine
 */
public class A396912 extends GfSequence {

  /** Construct the sequence. */
  public A396912() {
    super(0, new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SeriesRing.SQ.one();
      private final Sequence mSeq = new A258400();
      private long mA = mSeq.next().longValueExact();

      @Override
      public Q coeff(final long n) {
        while (n >= mA) {
          mS = SeriesRing.SQ.multiply(mS, SeriesRing.SQ.divide(SeriesRing.SQ.one(), SeriesRing.SQ.oneMinusXToTheN(mA)));
          mA = mSeq.next().longValueExact();
        }
        return mS.coeff(n);
      }
    });
  }
}
