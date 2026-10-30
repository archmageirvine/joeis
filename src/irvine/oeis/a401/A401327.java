
package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401327 Folding polygons.
 * @author Sean A. Irvine
 */
public class A401327 extends Sequence1 {

  private static final double EPS = 1e-10;

  private static final class Point {
    final double x;
    final double y;

    Point(final double x, final double y) {
      this.x = x;
      this.y = y;
    }
  }

  private int mN;

  private static double cross(final Point a, final Point b, final Point c) {
    return (b.x - a.x) * (c.y - a.y)
      - (b.y - a.y) * (c.x - a.x);
  }

  private static double area(final Point[] p) {
    double s = 0;
    for (int i = 0; i < p.length; ++i) {
      final Point a = p[i];
      final Point b = p[(i + 1) % p.length];
      s += a.x * b.y - a.y * b.x;
    }
    return Math.abs(s) / 2;
  }

  private static boolean onSegment(final Point a, final Point b,
                                   final Point p) {
    return p.x >= Math.min(a.x, b.x) - EPS
      && p.x <= Math.max(a.x, b.x) + EPS
      && p.y >= Math.min(a.y, b.y) - EPS
      && p.y <= Math.max(a.y, b.y) + EPS;
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

  private static boolean intersects(final Point a, final Point b,
                                    final Point c, final Point d) {
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
        // Adjacent edges share a permitted endpoint.
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

  private static Point reflect(final Point p, final Point a,
                               final Point b) {
    final double dx = b.x - a.x;
    final double dy = b.y - a.y;
    final double t = ((p.x - a.x) * dx + (p.y - a.y) * dy)
      / (dx * dx + dy * dy);
    final double hx = a.x + t * dx;
    final double hy = a.y + t * dy;
    return new Point(2 * hx - p.x, 2 * hy - p.y);
  }

  private int search(final Point[] p, final double oldArea) {
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
    return best;
  }

  @Override
  public Z next() {
    mN = mN == 0 ? 3 : mN + 1;
    final Point[] p = new Point[mN];
    for (int i = 0; i < mN; ++i) {
      final double angle = 2 * Math.PI * i / mN;
      p[i] = new Point(Math.cos(angle), Math.sin(angle));
    }
    return Z.valueOf(search(p, area(p)));
  }
}
