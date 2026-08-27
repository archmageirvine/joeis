package irvine.oeis.a398;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A398964 allocated for Ege \u00d6zt\u00fcrk.
 * @author Sean A. Irvine
 */
public class A398964 extends MultiplicativeSequence {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final Series<Z> S2 = SZ.divide(Series.create(1, 0, 4, 0, 0, 0, -1024), SZ.multiply(Series.create(1, -4), Series.create(1, 0, 0, 0, 0, 0, -2048)));
  private static final Series<Z> S3 = SZ.divide(Series.create(1, 0, 54, 0, 0, 0, -59049), SZ.multiply(Series.create(1, -9), Series.create(1, 0, 0, 0, 0, 0, -177147)));

  /** Construct the sequence. */
  public A398964() {
    super(1, (p, e) -> {
      if (e == 1) {
        return p.square();
      }
      if (p.compareTo(Z.FIVE) >= 0) {
        return p.pow(2L * e - 2).multiply(p.square().add(p).subtract(1));
      }
      if (p.equals(Z.TWO)) {
        return S2.coeff(e);
      }
      assert p.equals(Z.THREE);
      return S3.coeff(e);
    });
  }
}
