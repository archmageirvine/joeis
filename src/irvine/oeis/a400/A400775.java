package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400775 Fast-growing hierarchy {f_n(k)} read by antidiagonals, n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A400775 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    if (n == 0) {
      return Z.valueOf(k + 1);
    }
    if (n == 1) {
      return Z.valueOf(2 * k);
    }
    if (n == 2) {
      return Z.valueOf(k).shiftLeft(k);
    }
    Z v = Z.valueOf(k);
    for (long j = 0; j < k; ++j) {
      v = t(n - 1, v.longValueExact());
    }
    return v;
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
