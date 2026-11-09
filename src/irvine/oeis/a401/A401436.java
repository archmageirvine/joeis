package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401436 Square array A(n,k), n &gt;= 0, k &gt;= 1, read by descending antidiagonals: A(n,k) is the number of nonnegative integer solutions to x + y + k*z = n.
 * @author Sean A. Irvine
 */
public class A401436 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final long q = n / m;
    return Z.valueOf(q + 1).multiply(2 * n - m * q + 2).divide2();
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

