package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399132 Square array T(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals: T(n,k) = Sum_{j=0..n} Stirling2(n,j) * binomial(k+j-1, j-1), where Stirling2 are the Stirling numbers of the second kind (A008277).
 * @author Sean A. Irvine
 */
public class A399132 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Integers.SINGLETON.sum(0, n, j -> Functions.STIRLING2.z(n, j).multiply(Binomial.binomial(m + j - 1, j - 1)));
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
