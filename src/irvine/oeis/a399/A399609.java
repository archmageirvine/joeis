package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399609 Table of T(n, k) read by antidiagonals: k-dimensional simplex coordinate; repeat j exactly binomial(j+k-1, k-1) times, for n &gt;= 0, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A399609 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  private long t(final long n, final long k) {
    long m = 0;
    while (Functions.BINOMIAL.l(m + k, k) <= n) {
      ++m;
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN - mM, mM + 1));
  }
}
