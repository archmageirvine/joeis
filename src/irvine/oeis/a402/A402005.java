package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402005 Triangle T(n,k) read by rows: number of distinct proper crossing points formed by n vertical chords and k horizontal chords of a circle, equally spaced along their respective diameters, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A402005 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private long t(final long n, final long k) {
    long cnt = 0;
    final Z n12 = Z.valueOf(n + 1).square();
    final Z k12 = Z.valueOf(k + 1).square();
    final Z m = n12.multiply(k12);
    for (long i = 1; i <= n; ++i) {
      for (long j = 1; j <= k; ++j) {
        final long u = 2 * i - n - 1;
        final long v = 2 * j - k - 1;
        if (k12.multiply(u * u).add(n12.multiply(v * v)).compareTo(m) < 0) {
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
