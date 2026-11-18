package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A402005 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private long t(final long n, final long k) {
    long cnt = 0;
    final long m = (n + 1) * (n + 1) + (k + 1) * (k + 1);
    for (long i = 1; i <= n; ++i) {
      for (long j = 1; j <= k; ++j) {
        final long u = 2 * i - n - 1;
        final long v = 2 * j - k - 1;
        if (u * u + v * v < m) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
  }
}
