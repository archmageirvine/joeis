package irvine.oeis.a401;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401940 allocated for Narciso Gonzaga, Jr.
 * @author Sean A. Irvine
 */
public class A401940 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final Series<Z> C1 = Series.create(Z.ONE, Z.valueOf(-4), Z.THREE);
  private static final Series<Z> C2 = Series.create(Z.ZERO, Z.ONE, Z.valueOf(-3), Z.ONE);
  private static final SeriesRing<Series<Z>> RING = new SeriesRing<>(SZ);
  private static final Series<Series<Z>> S = RING.divide(RING.monomial(C1, 0), RING.create(C1, SZ.negate(C2)));
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return S.coeff(mM).coeff(mN);
  }
}
