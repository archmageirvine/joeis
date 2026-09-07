package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A399145 allocated for Eddie Lin Rui.
 * @author Sean A. Irvine
 */
public class A399145 extends Sequence3 {

  // After Eddie Lin Rui

  // These should be changed if the Python version uses different values.
  private static final double ANGLE_EPS = 1e-10;
  private static final double PARAM_EPS = 1e-10;
  private static final double POINT_EPS = 1e-10;

  /**
   * A point in the plane.
   */
  private static class Point {
    final double mX;
    final double mY;

    Point(final double x, final double y) {
      mX = x;
      mY = y;
    }
  }

  /**
   * A line segment.
   */
  private static class Edge {
    final Point mA;
    final Point mB;

    Edge(final Point a, final Point b) {
      mA = a;
      mB = b;
    }
  }

  /*
   * Spatial hash.  It is only used to find possible nearby points;
   * the actual POINT_EPS distance test is still performed, so this
   * does not change the definition of equality.
   */
  private final Map<Long, List<Point>> mPoints = new HashMap<>();

  private final Map<Integer, Edge[]> mEdges = new HashMap<>();

  private int mN = 2;
  private long mCount = 0;

  /**
   * Return the sides of the regular n-gon.
   */
  private static Edge[] edges(final int n) {
    final Point[] v = new Point[n];
    for (int j = 0; j < n; ++j) {
      final double theta = 2.0 * Math.PI * j / n;
      v[j] = new Point(Math.cos(theta), Math.sin(theta));
    }

    final Edge[] e = new Edge[n];
    for (int j = 0; j < n; ++j) {
      e[j] = new Edge(v[j], v[(j + 1) % n]);
    }
    return e;
  }

  /**
   * 2-dimensional cross product.
   */
  private static double cross(final double ax, final double ay,
                              final double bx, final double by) {
    return ax * by - ay * bx;
  }

  /**
   * Return the proper intersection of two line segments, or null.
   */
  private static Point intersect(final Edge e, final Edge f) {
    final double rx = e.mB.mX - e.mA.mX;
    final double ry = e.mB.mY - e.mA.mY;
    final double sx = f.mB.mX - f.mA.mX;
    final double sy = f.mB.mY - f.mA.mY;

    final double d = cross(rx, ry, sx, sy);

    // Scale-independent parallel test.
    if (Math.abs(d) < ANGLE_EPS
      * Math.hypot(rx, ry) * Math.hypot(sx, sy)) {
      return null;
    }

    final double qx = f.mA.mX - e.mA.mX;
    final double qy = f.mA.mY - e.mA.mY;

    final double t = cross(qx, qy, sx, sy) / d;
    final double u = cross(qx, qy, rx, ry) / d;

    if (PARAM_EPS < t && t < 1.0 - PARAM_EPS
      && PARAM_EPS < u && u < 1.0 - PARAM_EPS) {
      return new Point(e.mA.mX + t * rx, e.mA.mY + t * ry);
    }

    return null;
  }

  /**
   * Quantize a coordinate for the spatial hash.
   */
  private static long cell(final double x) {
    return (long) Math.floor(x / POINT_EPS);
  }

  /**
   * Hash two cell coordinates into one long.
   */
  private static long key(final long x, final long y) {
    // Cantor-style pairing, with signed coordinates mapped to nonnegative.
    final long xx = x >= 0 ? 2 * x : -2 * x - 1;
    final long yy = y >= 0 ? 2 * y : -2 * y - 1;
    final long s = xx + yy;
    return (s * (s + 1)) / 2 + yy;
  }

  /**
   * Add a point if it is genuinely new.
   *
   * @return true if the point was new
   */
  private boolean addPoint(final Point p) {
    final long cx = cell(p.mX);
    final long cy = cell(p.mY);

    /*
     * Search the point's cell and all eight neighboring cells.
     * This is sufficient because any point within POINT_EPS must
     * occur in one of these cells.
     */
    for (long dx = -1; dx <= 1; ++dx) {
      for (long dy = -1; dy <= 1; ++dy) {
        final List<Point> bucket = mPoints.get(key(cx + dx, cy + dy));
        if (bucket == null) {
          continue;
        }
        for (final Point q : bucket) {
          if (Math.hypot(p.mX - q.mX, p.mY - q.mY) <= POINT_EPS) {
            return false;
          }
        }
      }
    }

    mPoints.computeIfAbsent(key(cx, cy), k -> new ArrayList<>()).add(p);
    return true;
  }

  @Override
  public Z next() {
    if (++mN > 1000) {
      throw new UnsupportedOperationException("Floating-point is not known to be safe for larger values");
    }

    final Edge[] current = edges(mN);
    mEdges.put(mN, current);

    /*
     * Compare the new n-gon against every earlier polygon.
     */
    for (int m = 3; m < mN; ++m) {
      final Edge[] old = mEdges.get(m);

      for (final Edge e : old) {
        for (final Edge f : current) {
          final Point p = intersect(e, f);
          if (p != null && addPoint(p)) {
            ++mCount;
          }
        }
      }
    }

    return Z.valueOf(mCount);
  }
}
