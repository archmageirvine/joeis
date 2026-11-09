package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401136 Square array read by antidiagonals downwards: T(n,k) = (Product_{j=1..n-1} prime(j))*prime(n)^k - 1 for n, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A401136 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.PRIMORIAL_COUNT.z(n - 1).multiply(Functions.PRIME.z(n).pow(m)).subtract(1);
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
