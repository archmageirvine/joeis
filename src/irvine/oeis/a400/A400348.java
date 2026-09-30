package irvine.oeis.a400;

import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400348 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A400348 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return SeriesParser.parse("1/(1 - " + (m * m) + "*x/(1 - x))^(" + n + "/" + m + ")").coeff(n).toZ();
//    if (n == 0) {
//      return Z.ONE;
//    }
//    return Rationals.SINGLETON.sum(1, n, j -> Binomial.binomial(Q.valueOf(n / m).add(j - 1), j).multiply(Binomial.binomial(n - 1, j - 1)).multiply(Z.valueOf(m).pow(2 * j))).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
