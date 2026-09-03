package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399359 allocated for Alex Shvets.
 * @author Sean A. Irvine
 */
public class A399359 extends Sequence0 {

  private static final Z Z108 = Z.valueOf(108);
  private long mN = -1;
  private final Series<Q> mS = SeriesRing.SQ.pow(new Hypergeometric(new Q[] {new Q(1, 6), Q.ONE_THIRD}, new Q[] {Q.ONE}), 4);

  @Override
  public Z next() {
    return mS.coeff(++mN).multiply(Z108.pow(mN)).toZ();
  }
}

