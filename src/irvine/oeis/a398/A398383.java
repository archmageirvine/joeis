package irvine.oeis.a398;

import java.util.Collections;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a096.A096960;

/**
 * A398383 allocated for Alex Shvets.
 * @author Sean A. Irvine
 */
public class A398383 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Series<Q> mB = Series.create(new A096960().prepend(0));
  private final Series<Q> mU = SQ.shift(SQ.multiply(SQ.pow(new AbstractInfiniteSeries<>() {
    private Series<Q> mS = SQ.one();
    private long mK = 1;
    @Override
    public Q coeff(final long n) {
      while (n >= mK) {
        mS = SQ.multiply(mS, SQ.onePlusXToTheN(mK));
        ++mK;
      }
      return mS.coeff(n);
    }
  }, 24), Q.valueOf(64)), 1);
  private final Series<Q> mGf = SQ.divide(
    SQ.multiply(mB,
      SQ.add(
        SQ.multiply(SQ.square(mU), Q.FIVE),
        SQ.multiply(mU, Q.valueOf(22)),
        Series.create(Collections.singletonList(Q.FIVE))
      )
    ), SQ.pow(SQ.subtract(SQ.one(), mU), 3));
  private long mN = 0;

  @Override
  public Z next() {
    return mGf.coeff(++mN).divide(mN * mN).toZ();
  }
}

