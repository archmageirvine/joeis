package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400505 Array A(n,k), n &gt;= 2, k &gt;= 2, read by antidiagonals: number of unit squares in the k^n cubic grid.
 * @author Sean A. Irvine
 */
public class A400505 extends Sequence2 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Binomial.binomial(n, 2).multiply(Z.valueOf(m).pow(n - 2)).multiply(Z.valueOf(m - 1).square());
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 2, mN - mM + 2);
  }
}
