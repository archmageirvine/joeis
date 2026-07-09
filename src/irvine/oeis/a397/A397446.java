package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397446 a(n) is the number of distinct primitive, simple, nondegenerate, integer-sided quadrilaterals with both diagonals integral and integer area, having semiperimeter n.
 * @author Sean A. Irvine
 */
public class A397446 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private boolean triangle(final long x, final long y, final long z) {
    return x > 0 && y > 0 && z > 0 && x + y > z && x + z > y && y + z > x;
  }

  /**
   * Returns 4 times the area of the triangle, or 0 if it is not integral.
   */
  private long area4(final long x, final long y, final long z) {
    if (!triangle(x, y, z)) {
      return 0;
    }
    final long r = (x + y + z) * (-x + y + z) * (x - y + z) * (x + y - z);
    if (r <= 0) {
      return 0;
    }
    final long s = Functions.SQRT.l(r);
    return s * s == r ? s : 0;
  }

  private boolean good(final long a, final long b, final long c, final long d, final long e, final long f) {
    final boolean p = e == a + b || e == Math.abs(a - b) || e == c + d || e == Math.abs(c - d);
    final boolean q = f == a + d || f == Math.abs(a - d) || f == b + c || f == Math.abs(b - c);
    return !(p || q);
  }

  private long diagonal(final long a, final long b, final long c, final long d, final long e) {

    final long p1 = area4(a, b, e);
    if (p1 == 0) {
      return 0;
    }

    final long q1 = area4(c, d, e);
    if (q1 == 0) {
      return 0;
    }

    final long x1 = a * a + e * e - b * b;
    final long y1 = d * d + e * e - c * c;
    final long w1 = 4L * e * e;

    final long l1 = Math.max(Math.abs(a - d) + 1, Math.abs(b - c) + 1);
    final long u1 = Math.min(a + d - 1, b + c - 1);

    final long m1 = Math.max(Math.abs(a - c) + 1, Math.abs(b - d) + 1);
    final long v1 = Math.min(a + c - 1, b + d - 1);

    final long[] candidates = {p1 + q1, Math.abs(p1 - q1)};

    for (final long t : candidates) {
      if ((t & 3) != 0) {
        continue;
      }
      final long area = t / 4;
      final long z1 = (x1 - y1) * (x1 - y1) + 16L * area * area;
      if (z1 % w1 != 0) {
        continue;
      }
      final long s1 = z1 / w1;
      final long f = Functions.SQRT.l(s1);
      if (f * f != s1) {
        continue;
      }
      if (((l1 <= f && f <= u1) || (m1 <= f && f <= v1))
        && good(a, b, c, d, e, f)) {
        return f;
      }
    }

    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 7) {
      return Z.ZERO;
    }

    long count = 0;
    final long p = 2 * mN;

    for (long a = 1; a <= p / 4; ++a) {
      for (long b = 1; b <= p - a - 2; ++b) {
        for (long c = 1; c <= p - a - b - 1; ++c) {
          final long d = p - a - b - c;
          if (d <= 0) {
            continue;
          }

          final long[] h = A397406.canon(a, b, c, d);
          if (h[0] != a || h[1] != b || h[2] != c || h[3] != d) {
            continue;
          }

          final long s = Math.max(Math.abs(a - b) + 1, Math.abs(c - d) + 1);
          final long u = Math.min(a + b - 1, c + d - 1);
          if (s > u) {
            continue;
          }

          final HashSet<Long> seen = new HashSet<>();
          for (long e = s; e <= u; ++e) {
            final long f = diagonal(a, b, c, d, e);
            if (f != 0 && Functions.GCD.l(a, b, c, d, e, f) == 1) {
              final long lo = Math.min(e, f);
              final long hi = Math.max(e, f);
              final long key = (lo << 32) | (hi & 0xffffffffL);
              if (seen.add(key)) {
                ++count;
              }
            }
          }
        }
      }
    }

    return Z.valueOf(count);
  }
}
