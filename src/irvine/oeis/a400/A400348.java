package irvine.oeis.a400;

import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400348 Array read by ascending antidiagonals: A(n,k) = [x^n] 1/(1 - k^2*x/(1 - x))^(n/k), with k &gt; 0.
 * @author Sean A. Irvine
 */
public class A400348 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return SeriesParser.parse("1/(1 - " + (m * m) + "*x/(1 - x))^(" + n + "/" + m + ")").coeff(n).toZ();
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
