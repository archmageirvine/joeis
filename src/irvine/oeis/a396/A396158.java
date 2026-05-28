package irvine.oeis.a396;

import java.util.ArrayList;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396158 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A396158 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final Series<Z> S = SZ.create(Z.NEG_ONE, Z.SIX);
  private int mN = -0;
  private int mM = -1;
  private final ArrayList<Series<Z>> mSeries = new ArrayList<>();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM >= mSeries.size()) {
      final Series<Z> a = new Series<>() {
        private final long mT = mM;

        @Override
        public Z coeff(final long n) {
          if (n > mT) {
            return Z.ZERO;
          }
          if (n == 0) {
            return Z.NEG_ONE;
          }
          return Z.FIVE;
        }
        @Override
        public long bound() {
          return mT;
        }
      };
      mSeries.add(SZ.divide(SZ.monomial(mM), SZ.multiply(S, a)));
    }
    return mSeries.get(mM).coeff(mN);
  }
}
