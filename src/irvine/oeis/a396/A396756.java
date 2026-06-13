package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396756 a(n) is the number of Heronian triangles (p, q, k) with primes p &lt;= q &lt; k, where k = A396755(n).
 * @author Sean A. Irvine
 */
public class A396756 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;
  private final MemoryFunction1<Long> mG = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int k2) {
      final long k = 2L * k2;
      assert k >= 6;
      long a = 0;
      long q = Functions.NEXT_PRIME.l((k + 1) / 2 - 1);
      while (q < k) {
        final long m = Math.max(3, k - q + 1) | 1;
        final long u = k + q;
        final long v = k - q;
        long p = Functions.NEXT_PRIME.l(m - 1);
        while (p <= q) {
          if (Predicates.SQUARE.is(((p + u) / 2) * ((u - p) / 2) * ((p + v) / 2) * ((p - v) / 2))) {
            ++a;
          }
          p = Functions.NEXT_PRIME.l(p);
        }
        q = Functions.NEXT_PRIME.l(q);
      }
      return a;
    }
  };

  @Override
  public Z next() {
    ++mN;
    long t = 0;
    int k2 = 2;
    while (true) {
      final long a = mG.get(++k2);
      if (a > 0 && ++t == mN) {
        return Z.valueOf(a);
      }
    }
  }
}
