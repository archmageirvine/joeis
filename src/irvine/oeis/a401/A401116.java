package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400943
 * @author Sean A. Irvine
 */
public class A401116 extends Sequence0 {

  private static final Series<Q> S = SeriesRing.SQ.divide(Series.create(Arrays.asList(Q.ZERO, Q.FOUR)), Series.create(Arrays.asList(Q.NEG_ONE, Q.FOUR)));
  private static final Q[] HALF = {Q.HALF};
  private final List<Series<Q>> mSeries = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  private Series<Q> row(final int m) {
    return Hypergeometric.s(new Q[] {new Q(-(2L * m + 1), 2), new Q(2L * m + 1, 2)}, HALF, S);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mSeries.add(row(mN));
    }
    return mSeries.get(mM).coeff(mN - mM).toZ();
  }
}

