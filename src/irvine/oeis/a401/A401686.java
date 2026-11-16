package irvine.oeis.a401;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401686 Irregular triangle T(n, k), n &gt;= 0, k = 0, 1, ..., 2*n, giving in row n the parts of a certain partition of A003261(n+1) related to a chain problem.
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
