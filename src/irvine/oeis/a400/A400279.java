package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400279
 * @author Sean A. Irvine
 */
public class A400279 extends Sequence0 {

  /** Numerical tolerance. */
  private static final double EPS = 1e-11;

  /** Polygons already drawn. */
  private final List<double[][]> mPolygons = new ArrayList<>();

  /** Number of terms generated. */
  private int mN = 0;

  /**
   * Constructor.
   *
   * The vertices are stored clockwise.
   */
  public A400279() {
    mPolygons.add(new double[][] {
      {0.0, 0.0},
      {0.5, Math.sqrt(3.0) / 2.0},
      {1.0, 0.0}
    });
  }

  @Override
  public Z next() {
    ++mN;

    if (mN == 1) {
      return Z.ZERO;
    }

    final int sides = mN + 2;
    final double[][] previous = mPolygons.get(mPolygons.size() - 1);

    /*
     * Try edges in increasing index order.
     *
     * edge 0 = [V(...,1), V(...,2)]
     * edge 1 = [V(...,2), V(...,3)]
     * etc.
     */
    for (int edge = 0; edge < previous.length; ++edge) {
      final double[][] candidate = makePolygon(
        previous[edge],
        previous[(edge + 1) % previous.length],
        sides);

      boolean overlap = false;
      for (final double[][] old : mPolygons) {
        if (interiorsOverlap(candidate, old)) {
          overlap = true;
          break;
        }
      }

      if (!overlap) {
        mPolygons.add(candidate);
        return Z.valueOf(edge);
      }
    }

    throw new IllegalStateException(
      "No valid edge for polygon with " + sides + " sides");
  }

  /**
   * Construct a regular m-gon sharing the edge a -> b.
   *
   * The old polygons are clockwise, so their interiors are on the
   * right of their directed edges.  The new polygon is therefore
   * constructed on the left.
   *
   * In the new polygon:
   *
   *   V(m,1) = a
   *   V(m,m) = b
   *
   * and hence its shared edge is [V(m,m), V(m,1)].
   */
  private static double[][] makePolygon(final double[] a,
                                        final double[] b,
                                        final int m) {
    final double dx = b[0] - a[0];
    final double dy = b[1] - a[1];
    final double side = Math.hypot(dx, dy);

    // Left-hand normal.
    final double nx = -dy / side;
    final double ny = dx / side;

    // Apothem.
    final double apothem =
      side / (2.0 * Math.tan(Math.PI / m));

    // Centre of the new polygon.
    final double cx =
      (a[0] + b[0]) / 2.0 + nx * apothem;
    final double cy =
      (a[1] + b[1]) / 2.0 + ny * apothem;

    // Circumradius.
    final double radius =
      side / (2.0 * Math.sin(Math.PI / m));

    // Angle of V(m,1).
    final double theta =
      Math.atan2(a[1] - cy, a[0] - cx);

    final double[][] result = new double[m][2];

    /*
     * Clockwise around the centre.
     */
    for (int j = 0; j < m; ++j) {
      final double angle =
        theta - 2.0 * Math.PI * j / m;

      result[j][0] = cx + radius * Math.cos(angle);
      result[j][1] = cy + radius * Math.sin(angle);
    }

    /*
     * Make the shared edge exact.
     */
    result[0][0] = a[0];
    result[0][1] = a[1];

    result[m - 1][0] = b[0];
    result[m - 1][1] = b[1];

    return result;
  }

  /**
   * Test whether the interiors of two convex polygons overlap.
   *
   * Touching is allowed.
   */
  private static boolean interiorsOverlap(final double[][] p,
                                          final double[][] q) {
    return !hasNonPositiveOverlapAxis(p, q)
      && !hasNonPositiveOverlapAxis(q, p);
  }

  /**
   * Test the edge normals of p for an axis on which the projected
   * interiors do not overlap.
   */
  private static boolean hasNonPositiveOverlapAxis(final double[][] p,
                                                   final double[][] q) {
    for (int i = 0; i < p.length; ++i) {
      final double[] a = p[i];
      final double[] b = p[(i + 1) % p.length];

      double ax = -(b[1] - a[1]);
      double ay = b[0] - a[0];

      final double length = Math.hypot(ax, ay);
      ax /= length;
      ay /= length;

      double pMin = Double.POSITIVE_INFINITY;
      double pMax = Double.NEGATIVE_INFINITY;

      for (final double[] v : p) {
        final double d = v[0] * ax + v[1] * ay;
        pMin = Math.min(pMin, d);
        pMax = Math.max(pMax, d);
      }

      double qMin = Double.POSITIVE_INFINITY;
      double qMax = Double.NEGATIVE_INFINITY;

      for (final double[] v : q) {
        final double d = v[0] * ax + v[1] * ay;
        qMin = Math.min(qMin, d);
        qMax = Math.max(qMax, d);
      }

      final double scale = Math.max(1.0,
        Math.max(Math.abs(pMin),
          Math.max(Math.abs(pMax),
            Math.max(Math.abs(qMin), Math.abs(qMax)))));

      final double eps = EPS * scale;

      final double overlap =
        Math.min(pMax, qMax) - Math.max(pMin, qMin);

      /*
       * Zero overlap means that the polygons either are separated
       * or merely touch.  In either case their interiors don't
       * overlap.
       */
      if (overlap <= eps) {
        return true;
      }
    }

    return false;
  }
}
