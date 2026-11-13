package irvine.oeis.a401;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401760 Array A(n,k), n &gt;= 3, k &gt;= 2, read by antidiagonals: number of unit cubes in the k^n cubic grid.
 * @author Sean A. Irvine
 */
public class A401760 extends Sequence3 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    return Binomial.binomial(n, 3).multiply(Z.valueOf(k).pow(n - 3)).multiply(Z.valueOf(k - 1).pow(3));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 3, mN - mM + 2);
  }
}
