
package irvine.oeis.a401;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401327 Folding polygons.
 * @author Sean A. Irvine
 */
public class A401327 extends Sequence3 {

  private static final double EPS = 1e-10;

  private static final class Point {
    final double mX;
    final double mY;

    private Point(final double x, final double y) {
      mX = x;
      mY = y;
    }
  }

  private int mN = 2;

  private static double cross(final Point a, final Point b, final Point c) {
    return (b.mX - a.mX) * (c.mY - a.mY) - (b.mY - a.mY) * (c.mX - a.mX);
  }

  private static double area(final Point[] p) {
    double s = 0;
    for (int i = 0; i < p.length; ++i) {
      final Point a = p[i];
      final Point b = p[(i + 1) % p.length];
      s += a.mX * b.mY - a.mY * b.mX;
    }
    return Math.abs(s) / 2;
  }

  private static boolean onSegment(final Point a, final Point b, final Point p) {
    return p.mX >= Math.min(a.mX, b.mX) - EPS
      && p.mX <= Math.max(a.mX, b.mX) + EPS
      && p.mY >= Math.min(a.mY, b.mY) - EPS
      && p.mY <= Math.max(a.mY, b.mY) + EPS;
  }

  private static int sign(final double x) {
    if (x > EPS) {
      return 1;
    }
    if (x < -EPS) {
      return -1;
    }
    return 0;
  }

  private static boolean intersects(final Point a, final Point b, final Point c, final Point d) {
    final int o1 = sign(cross(a, b, c));
    final int o2 = sign(cross(a, b, d));
    final int o3 = sign(cross(c, d, a));
    final int o4 = sign(cross(c, d, b));
    if (o1 * o2 < 0 && o3 * o4 < 0) {
      return true;
    }
    return o1 == 0 && onSegment(a, b, c)
      || o2 == 0 && onSegment(a, b, d)
      || o3 == 0 && onSegment(c, d, a)
      || o4 == 0 && onSegment(c, d, b);
  }

  private static boolean simple(final Point[] p) {
    final int n = p.length;
    for (int i = 0; i < n; ++i) {
      final int i2 = (i + 1) % n;
      for (int j = i + 1; j < n; ++j) {
        final int j2 = (j + 1) % n;
        // Adjacent edges share a permitted endpoint
        if (i == j || i2 == j || j2 == i) {
          continue;
        }
        if (intersects(p[i], p[i2], p[j], p[j2])) {
          return false;
        }
      }
    }
    return true;
  }

  private static Point reflect(final Point p, final Point a, final Point b) {
    final double dx = b.mX - a.mX;
    final double dy = b.mY - a.mY;
    final double t = ((p.mX - a.mX) * dx + (p.mY - a.mY) * dy) / (dx * dx + dy * dy);
    final double hx = a.mX + t * dx;
    final double hy = a.mY + t * dy;
    return new Point(2 * hx - p.mX, 2 * hy - p.mY);
  }


  private final Map<StateKey, Integer> mCache = new HashMap<>();

  private static final class StateKey {
    private static final double SCALE = 1e10;
    private final long[] mCoordinates;
    private final int mHashCode;

    StateKey(final Point[] p) {
      final int n = p.length;
      final long[] x = new long[n];
      final long[] y = new long[n];
      for (int i = 0; i < n; ++i) {
        x[i] = Math.round(p[i].mX * SCALE);
        y[i] = Math.round(p[i].mY * SCALE);
      }

      long[] best = null;
      for (int start = 0; start < n; ++start) {
        for (int dir : new int[] {1, -1}) {
          final long[] candidate = new long[2 * n];
          for (int i = 0; i < n; ++i) {
            final int j = (start + dir * i + n * n) % n;
            candidate[2 * i] = x[j];
            candidate[2 * i + 1] = y[j];
          }
          if (best == null || compare(candidate, best) < 0) {
            best = candidate;
          }
        }
      }
      mCoordinates = best;
      mHashCode = Arrays.hashCode(best);
    }

    private static int compare(final long[] a, final long[] b) {
      for (int i = 0; i < a.length; ++i) {
        final int c = Long.compare(a[i], b[i]);
        if (c != 0) {
          return c;
        }
      }
      return 0;
    }

    @Override
    public int hashCode() {
      return mHashCode;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof StateKey
        && Arrays.equals(mCoordinates, ((StateKey) obj).mCoordinates);
    }
  }


  private int search(final Point[] p, final double oldArea) {
    final StateKey key = new StateKey(p);
    final Integer cached = mCache.get(key);
    if (cached != null) {
      return cached;
    }

    int best = 0;
    for (int i = 0; i < mN; ++i) {
      final int prev = (i + mN - 1) % mN;
      final int next = (i + 1) % mN;
      final Point[] q = p.clone();
      q[i] = reflect(p[i], p[prev], p[next]);
      if (!simple(q)) {
        continue;
      }
      final double newArea = area(q);
      if (newArea >= oldArea - EPS * Math.max(1.0, oldArea)) {
        continue;
      }
      best = Math.max(best, 1 + search(q, newArea));
    }

    mCache.put(key, best);
    return best;
  }

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ZERO;
    }
    mCache.clear();
    final Point[] p = new Point[mN];
    for (int i = 0; i < mN; ++i) {
      final double angle = 2 * Math.PI * i / mN;
      p[i] = new Point(Math.cos(angle), Math.sin(angle));
    }
    // WLOG we can perform the initial fold since all vertices are equivalent
    final double a = area(p);
    p[0] = reflect(p[0], p[mN - 1], p[1]);
    if (!simple(p)) {
      return Z.ZERO;
    }
    final double b = area(p);
    if (b >= a) {
      return Z.ZERO;
    }
    return Z.valueOf(1 + search(p, b));
  }
}
