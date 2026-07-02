package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396789 Triangle read by rows: T(n, k) is the smallest positive integer m such that there exists a primitive Pythagorean triple with legs prime(n) and m*prime(k), for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A396789 extends Sequence2 {

  private static final long[] S = {1, -1};
  private long mN = 1;
  private long mM = 0;

  protected long f(final long b, final long r, final long p, final long q, final long u) {
    long v = r == 0 ? p : r;
    while (v < u) {
      if ((u % q == 0 || v % q == 0) && ((u - v) & 1) == 1 && Functions.GCD.l(u, v) == 1) {
        final long m = 2 * (u * v / q) * (u * u - v * v) / p;
        if (m < b) {
          return m;
        }
      }
      v += p;
    }
    return 0;
  }

  private Z t(final long n, final long k) {
    final long p = Functions.PRIME.l(n);
    final long q = Functions.PRIME.l(k);
    if (k == 1) {
      return Z.valueOf((p * p - 1) / 4);
    }
    if (k == 2) {
      return Z.valueOf((p * p - 1) / 6);
    }
    long u = 2;
    long b = Long.MAX_VALUE;
    while (true) {
      ++u;
      for (final long s : S) {
        long r = (s * u) % p;
        if (r < 0) {
          r += p;
        }
        long v = r == 0 ? p : r;
        while (v < u) {
          if ((u % q == 0 || v % q == 0) && ((u - v) & 1) == 1 && Functions.GCD.l(u, v) == 1) {
            final long m = 2 * (u * v / q) * (u * u - v * v) / p;
            if (m < b) {
              b = m;
            }
          }
          v += p;
        }
      }
      if (b < Long.MAX_VALUE) {
        final long c = (2 * (u + 1)) / p;
        final long d = (2 * (u + 1)) / q;
        if (c * d > b) {
          return Z.valueOf(b);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
