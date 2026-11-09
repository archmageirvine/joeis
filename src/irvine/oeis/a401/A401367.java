package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401367 Array A(n,k), n &gt;= 1, k &gt;= 2, read by descending antidiagonals: number of pairs of adjacent edges in the k^n cubic grid.
 * @author Sean A. Irvine
 */
public class A401367 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    return n == 1 ? Z.valueOf(k - 2) : Z.valueOf(k).pow(n - 2).multiply(n).multiply(Z.valueOf(2 *  n - 1).multiply(k - 1).multiply(k - 1).subtract(1));
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
