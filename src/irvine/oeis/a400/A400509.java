package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400509 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A400509 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private static boolean f(final Z p, final Z r, final Z b, final Z q, final Z s) {
    if (q.signum() < 0 && b.square().compareTo(q.square().multiply(s)) < 0) {
      return false;
    }
    final Z k = p.square().multiply(r).subtract(b.square()).subtract(q.square().multiply(s));
    final Z l = b.multiply(q).multiply(2);
    if (l.signum() >= 0) {
      return k.signum() <= 0 || k.square().compareTo(l.square().multiply(s)) <= 0;
    }
    return k.signum() < 0 && k.square().compareTo(l.square().multiply(s)) >= 0;
  }

  /**
   * Maple g(q,r,s,n).
   */
  private static boolean g(final long q0, final long r0, final long s0, final long n0) {
    final Z q = Z.valueOf(q0);
    final Z r = Z.valueOf(r0);
    final Z s = Z.valueOf(s0);
    final Z n = Z.valueOf(n0);

    if (q0 < n0 || q.square().compareTo(n.square().multiply(2)) > 0) {
      return false;
    }

    final Z w = q.add(r).add(s).multiply(q.negate().add(r).add(s)).multiply(q.subtract(r).add(s)).multiply(q.add(r).subtract(s));
    if (w.signum() <= 0) {
      return false;
    }

    final Z d = q.square().subtract(n.square());
    final Z u = q.square().add(r.square()).subtract(s.square());
    final Z v = q.square().add(s.square()).subtract(r.square());
    final Z p = w.multiply(d);
    final Z n2 = n.square();

    if (u.signum() < 0 && p.compareTo(n2.multiply(u.square())) < 0) {
      return false;
    }
    if (v.signum() < 0 || p.compareTo(n2.multiply(v.square())) > 0) {
      return false;
    }
    if (u.signum() > 0 && n2.multiply(w).compareTo(u.square().multiply(d)) < 0) {
      return false;
    }

    final Z b = n.multiply(q.square()).multiply(2);
    if (!f(n, w, b, u, d)) {
      return false;
    }
    if (v.signum() < 0 && n2.multiply(w).compareTo(v.square().multiply(d)) < 0) {
      return false;
    }
    return f(n, w, b, v.negate(), d);
  }

  private static boolean h(final long x, final long y, final long z, final long n) {
    return g(z, x, y, n) || g(z, y, x, n) || g(y, x, z, n) || g(y, z, x, n) || g(x, y, z, n) || g(x, z, y, n);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long maxZ = Functions.SQRT.l(2 * mN * mN);
    for (long z = mN; z <= maxZ; ++z) {
      for (long y = z / 2 + 1; y <= z; ++y) {
        for (long x = z - y + 1; x <= y; ++x) {
          if (h(x, y, z, mN)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
