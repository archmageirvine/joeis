package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401040 Irregular triangle read by rows: T(n,k) is the number of integers in [1,n] having no prime factor &lt;= prime(k), for n &gt;= 2 and 1 &lt;= k &lt;= pi(n).
 * @author Sean A. Irvine
 */
public class A401040 extends Sequence2 {

  // After Jan Snellman

  private long mN = 2;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    long cnt = 0;
    final long q = Functions.PRIME.l(k);
    for (long m = 1; m <= n; ++m) {
      boolean ok = true;
      for (long p = 2; p <= q; p = Functions.NEXT_PRIME.l(p)) {
        if (m % p == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    if (++mM > Functions.PRIME_PI.l(mN)) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
