package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394095 Number of convex sets satisfying the condition.
 * @author Sean A. Irvine
 */
public class A396755 extends Sequence1 {

  // After Felix Huber

  private long mN = 4;

  private boolean is(final long k) {
    assert (k & 1) == 0 && k >= 6;
    long q = Functions.NEXT_PRIME.l(k / 2);
    while (q < k) {
      final long m = Math.max(3, k - q + 1) | 1;
      final long u = k + q;
      final long v = k - q;
      long p = Functions.NEXT_PRIME.l(m - 1);
      while (p <= q) {
        if (Predicates.SQUARE.is(((p + u) / 2) * ((u - p) / 2) * ((p + v) / 2) * ((p - v) / 2))) {
          return true;
        }
        p = Functions.NEXT_PRIME.l(p);
      }
      q = Functions.NEXT_PRIME.l(q);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
