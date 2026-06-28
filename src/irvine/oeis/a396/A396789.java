package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396789 Triangle read by rows: T(n, k) is the smallest positive integer m such that there exists a primitive Pythagorean triple with legs prime(n) and m*prime(k), for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A396789 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  protected long f(final long r, final long p, final long q, final long u) {
    long v = r == 0 ? p : r;
    while (v < u) {
      if ((u % q == 0 || v % q == 0) && ((u - v) & 1) == 1 && Functions.GCD.l(u, v) == 1) {
        return 2 * (u * v / q) * (u * u - v * v) / p;
      }
      v += p;
    }
    return 0;
  }

  private Z t(final long n, final long k) {
    final long p = Functions.PRIME.l(n);
    final long q = Functions.PRIME.l(k);
    long u = 1;
    while (true) {
      ++u;
      final long r = u % p;
      final long f = f(r, p, q, u);
      if (f != 0) {
        return Z.valueOf(f);
      }
      final long s = (p - u) % p;
      if (s != r) {
        final long g = f(s, p, q, u);
        if (g != 0) {
          return Z.valueOf(g);
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
