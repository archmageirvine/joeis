package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400886 Table read by descending antidiagonals: T(n, k) = (k*n-sigma(n))/gcd(tau(n)-k, k*n-sigma(n)), n&gt;=2, k&gt;=0.
 * @author Sean A. Irvine
 */
public class A400886 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final Z u = Z.valueOf(n * m).subtract(Functions.SIGMA1.z(n));
    final Z t = Functions.SIGMA0.z(n).subtract(m) ;
    return u.divide(Functions.GCD.z(t, u));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM);
  }
}

