package irvine.oeis.a401;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A401686 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private long mN = 0;
  private long mM = -1;
  private Series<Z> mS = SeriesRing.SZ.one();

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
      mS = SZ.add(
        SZ.divide(SZ.oneMinusXToTheN(mN), SZ.oneMinusXToTheN(1)),
        SZ.shift(SZ.multiply(SZ.divide(SZ.oneMinusXToTheN(Z.ONE.shiftLeft(mN + 1), mN + 1), SZ.oneMinusXToTheN(Z.TWO, 1)), Z.valueOf(mN + 1)), mN)
      );
    }
    return mS.coeff(mM);
  }
}
