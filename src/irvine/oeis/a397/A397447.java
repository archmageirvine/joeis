package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397447 a(n) is the number of distinct primitive cyclic integer-sided quadrilaterals with integral diagonals and integer area, having semiperimeter n.
 * @author Sean A. Irvine
 */
public class A397447 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private boolean isValid(final long a, final long b, final long c, final long d, final long s) {
    final long h = (s - a) * (s - b) * (s - c) * (s - d);
    if (h <= 0 || !Predicates.SQUARE.is(h)) {
      return false;
    }

    final long j = Math.max(Math.abs(a - b) + 1, Math.abs(c - d) + 1);
    final long k = Math.min(a + b - 1, c + d - 1);

    final long l = Math.max(Math.abs(b - c) + 1, Math.abs(d - a) + 1);
    final long m = Math.min(b + c - 1, d + a - 1);

    if (j > k || l > m) {
      return false;
    }

    final long t = a * c + b * d;
    final long u = a * d + b * c;
    final long v = a * b + c * d;

    if ((t * u) % v != 0) {
      return false;
    }

    final long w = (t * u) / v;
    if (w < j * j || w > k * k || !Predicates.SQUARE.is(w)) {
      return false;
    }

    final long e = Functions.SQRT.l(w);
    if ((t * v) % u != 0) {
      return false;
    }

    final long y = (t * v) / u;
    if (y < l * l || y > m * m || !Predicates.SQUARE.is(y)) {
      return false;
    }

    final long f = Functions.SQRT.l(y);

    if (!(Math.abs(a - b) < e && e < a + b)) {
      return false;
    }
    if (!(Math.abs(c - d) < e && e < c + d)) {
      return false;
    }
    if (!(Math.abs(b - c) < f && f < b + c)) {
      return false;
    }
    if (!(Math.abs(d - a) < f && f < d + a)) {
      return false;
    }

    return Functions.GCD.l(a, b, c, d, e, f) == 1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 4) {
      return Z.ZERO;
    }

    final long p = 2 * mN;
    long count = 0;

    for (int a = 1; a <= p - 3; ++a) {
      for (int b = 1; b <= p - a - 2; ++b) {
        for (int c = 1; c <= p - a - b - 1; ++c) {
          final long d = p - a - b - c;
          if (d <= 0) {
            continue;
          }

          final long[] r = A397406.canon(a, b, c, d);
          if (r[0] != a || r[1] != b || r[2] != c || r[3] != d) {
            continue;
          }

          if (isValid(a, b, c, d, mN)) {
            ++count;
          }
        }
      }
    }

    return Z.valueOf(count);
  }
}
