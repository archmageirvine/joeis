package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400322 Square array A(n,k), n &gt;= 0, k &gt;= 1, read by antidiagonals: A(n,k) is the number of nonnegative integer solutions to x + y + kz + kw = n.
 * @author Sean A. Irvine
 */
public class A400322 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final long q = n / m;
    final long r = n % m;
    return Z.valueOf(q + 1).multiply(q + 2).multiply(m * q + 3 * r + 3).divide(6);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM + 1);
  }
}
