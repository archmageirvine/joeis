package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401120 Array A(n,k), n &gt;= 1, k &gt;= 2, read by antidiagonals: number of edges in the k^n cubic grid.
 * @author Sean A. Irvine
 */
public class A401120 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(m).pow(n - 1).multiply(m - 1).multiply(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 2);
  }
}
