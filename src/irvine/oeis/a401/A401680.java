package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A401680 a(1) = 1; for n &gt; 1, a(n) is the number of k &lt; n such that a(k) &lt; n - k &lt;= 3*a(k).
 * @author Sean A. Irvine
 */
public class A401680 extends CachedSequence {

  /** Construct the sequence. */
  public A401680() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      long cnt = 0;
      for (long k = 1; k < n; ++k) {
        final long ak = self.a(k).longValueExact();
        if (ak < n - k && n - k <= 3 * ak) {
          ++cnt;
        }
      }
      return Z.valueOf(cnt);
    });
  }
}

