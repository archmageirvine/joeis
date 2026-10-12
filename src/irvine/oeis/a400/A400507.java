package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400507 Square array A(n,k) = k*(k+2)^(n-1), n &gt;= 1, k &gt;= 1, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A400507 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(m + 2).pow(n - 1).multiply(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}

