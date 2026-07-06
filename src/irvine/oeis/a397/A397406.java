package irvine.oeis.a397;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397406 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A397406 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  static long[] canon(final long a, final long b, final long c, final long d) {
    final long[][] x = {
      {a, b, c, d},
      {b, c, d, a},
      {c, d, a, b},
      {d, a, b, c},
      {d, c, b, a},
      {c, b, a, d},
      {b, a, d, c},
      {a, d, c, b}
    };

    long[] best = x[0];
    for (int k = 1; k < x.length; ++k) {
      if (LongUtils.lt(x[k], best)) {
        best = x[k];
      }
    }
    return best;
  }

  private boolean isValid(final long a, final long b, final long c, final long d) {

    final long p = Math.max(Math.abs(a - b) + 1, Math.abs(c - d) + 1);
    final long q = Math.min(a + b - 1, c + d - 1);
    if (p > q) {
      return false;
    }

    final long r = Math.max(Math.abs(b - c) + 1, Math.abs(d - a) + 1);
    final long s = Math.min(b + c - 1, d + a - 1);
    if (r > s) {
      return false;
    }

    final long t = a * b * (c * c + d * d) + c * d * (a * a + b * b);
    final long u = a * b + c * d;

    final long v = b * c * (d * d + a * a) + d * a * (b * b + c * c);
    final long w = b * c + d * a;

    if (t % u != 0 || v % w != 0) {
      return false;
    }

    final long x = t / u;
    final long y = v / w;

    if (x <= 0 || y <= 0) {
      return false;
    }

    if (x < p * p || x > q * q || y < r * r || y > s * s) {
      return false;
    }

    final long e = (long) Math.sqrt(x);
    final long f = (long) Math.sqrt(y);

    if (e * e != x || f * f != y) {
      return false;
    }

    return e * f == a * c + b * d;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 4) {
      return Z.ZERO;
    }

    long cnt = 0;

    for (long a = 1; a <= mN; ++a) {
      for (long b = 1; b <= mN - a; ++b) {
        for (long c = 1; c <= mN - a - b; ++c) {
          final long d = mN - a - b - c;
          if (d <= 0) {
            continue;
          }

          final long[] h = canon(a, b, c, d);
          if (h[0] != a || h[1] != b || h[2] != c || h[3] != d) {
            continue;
          }

          if (isValid(a, b, c, d)) {
            ++cnt;
          }
        }
      }
    }

    return Z.valueOf(cnt);
  }
}
