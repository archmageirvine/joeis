package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398713 Table read by descending antidiagonals: T(n, k) = smallest number m such that 2*(n*m+k) = Sum_{d|m} (n*d+k), n&gt;=0, k&gt;=0.
 * @author Sean A. Irvine
 */
public class A398713 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    final Z n2 = Z.valueOf(2 * n);
    long m = 1;
    while (!n2.multiply(m).equals(Functions.SIGMA1.z(m).multiply(n).add(Functions.SIGMA0.z(m).subtract(2).multiply(k)))) {
      ++m;
    }
    return Z.valueOf(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
