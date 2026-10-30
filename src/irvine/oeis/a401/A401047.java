package irvine.oeis.a401;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401047 allocated for Marco Mantovanelli.
 * @author Sean A. Irvine
 */
public class A401047 extends Sequence0 {

  private int mN = -1;

  private static long reverse(final long s, final int width) {
    long r = 0;
    for (int i = 0; i < width; ++i) {
      r = (r << 1) | ((s >>> i) & 1L);
    }
    return r;
  }

  private static Z profile(final long s, final int n) {
    final Z base = Z.valueOf(n + 2L);
    Z key = Z.ZERO;
    for (int d = 1; d <= n; ++d) {
      final int count = Long.bitCount(s & (s >>> d));
      key = key.multiply(base).add(Z.valueOf(count));
    }
    return key;
  }

  @Override
  public Z next() {
    if (++mN <= 10) {
      return Z.ZERO;
    }
    final Map<Z, Long> counts = new HashMap<>();
    long total = 0;
    final long limit = 1L << (mN - 1);
    for (long u = 0; u < limit; ++u) {
      final long s = (1L << mN) + (u << 1) + 1;
      if (s <= reverse(s, mN + 1)) {
        final Z key = profile(s, mN);
        final long seen = counts.getOrDefault(key, 0L);
        total += seen;
        counts.put(key, seen + 1);
      }
    }
    return Z.valueOf(total);
  }
}
