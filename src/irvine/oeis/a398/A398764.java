package irvine.oeis.a398;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;

/**
 * A398764 a(n) = the height h of the highest building which can see exactly h earlier buildings.
 * @author Sean A. Irvine
 */
public class A398764 extends CachedSequence {

  /** Construct the sequence. */
  public A398764() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      for (long h = n; h > 0; --h) {
        if (visible(self, n, h) == h) {
          return Z.valueOf(h);
        }
      }
      throw new RuntimeException();
    });
  }

  private static long visible(final DirectSequence self, final long n, final long h) {
    long count = 0;
    Q best = null;
    for (long j = n - 1; j >= 0; --j) {
      final Q t = new Q(self.a(j).subtract(h), n - j);
      if (best == null || t.compareTo(best) > 0) {
        ++count;
        best = t;
      }
    }
    return count;
  }
}
