package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400279 The number of skipped edges in the regular (n+1)-gon when the regular (n+2)-gon is drawn in a particular polygon spiral (see comments).
 * @author Sean A. Irvine
 */
public class A400279 extends Sequence0 {

  // The "double" arithmetic version of this is much faster

  private static final int ACCURACY = -500;

  /** Polygons already drawn, vertices are stored clockwise. */
  private final List<CR[][]> mPolygons = new ArrayList<>();

  /** Number of terms generated. */
  private int mN = 0;

  /** Construct the sequence. */
  public A400279() {
    mPolygons.add(new CR[][] {
      {CR.ZERO, CR.ZERO},
      {CR.HALF, CR.THREE.sqrt().divide(2)},
      {CR.ONE, CR.ZERO}
    });
  }

  /*
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
  private static CR[][] makePolygon(final CR[] a, final CR[] b, final int m) {
    final CR dx = b[0].subtract(a[0]);
    final CR dy = b[1].subtract(a[1]);
    final CR side = dx.square().add(dy.square()).sqrt();
    // Left-hand normal
    final CR nx = dy.negate().divide(side);
    final CR ny = dx.divide(side);
    // Apothem
    final CR apothem = side.divide(CR.PI.divide(m).tan().multiply(2));
    // Centre of the new polygon
    final CR cx = a[0].add(b[0]).divide(2).add(nx.multiply(apothem));
    final CR cy = a[1].add(b[1]).divide(2).add(ny.multiply(apothem));
    // Circumradius
    final CR radius = side.divide(CR.PI.divide(m).sin().multiply(2));
    // Angle of V(m,1)
    final CR theta = ComputableReals.SINGLETON.atan2(a[1].subtract(cy), a[0].subtract(cx));
    final CR[][] result = new CR[m][2];
    // Clockwise around the centre
    for (int j = 0; j < m; ++j) {
      final CR angle = theta.subtract(CR.TAU.multiply(j).divide(m));
      result[j][0] = cx.add(angle.cos().multiply(radius));
      result[j][1] = cy.add(angle.sin().multiply(radius));
    }
    // Make the shared edge exact
    result[0][0] = a[0];
    result[0][1] = a[1];
    result[m - 1][0] = b[0];
    result[m - 1][1] = b[1];
    return result;
  }

  /*
   * Test whether the interiors of two convex polygons overlap.
   * Touching is allowed.
   */
  private static boolean interiorsOverlap(final CR[][] p, final CR[][] q) {
    return !hasNonPositiveOverlapAxis(p, q) && !hasNonPositiveOverlapAxis(q, p);
  }

  private static CR min(final CR a, final CR b) {
    return a == null ? b : a.min(b);
  }

  private static CR max(final CR a, final CR b) {
    return a == null ? b : a.max(b);
  }

  /*
   * Test the edge normals of p for an axis on which the projected
   * interiors do not overlap.
   */
  private static boolean hasNonPositiveOverlapAxis(final CR[][] p, final CR[][] q) {
    for (int i = 0; i < p.length; ++i) {
      final CR[] a = p[i];
      final CR[] b = p[(i + 1) % p.length];
      CR ax = a[1].subtract(b[1]);
      CR ay = b[0].subtract(a[0]);
      final CR length = ax.square().add(ay.square()).sqrt();
      ax = ax.divide(length);
      ay = ay.divide(length);

      CR pMin = null;
      CR pMax = null;
      for (final CR[] v : p) {
        final CR d = v[0].multiply(ax).add(v[1].multiply(ay));
        pMin = min(pMin, d);
        pMax = max(pMax, d);
      }

      CR qMin = null;
      CR qMax = null;
      for (final CR[] v : q) {
        final CR d = v[0].multiply(ax).add(v[1].multiply(ay));
        qMin = min(qMin, d);
        qMax = max(qMax, d);
      }

      final CR overlap = pMax.min(qMax).subtract(pMin.max(qMin));

      /*
       * Zero overlap means that the polygons either are separated
       * or merely touch.  In either case their interiors don't
       * overlap.
       */
      if (overlap.signum(ACCURACY) <= 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final int sides = mN + 2;
    final CR[][] previous = mPolygons.get(mPolygons.size() - 1);
    /*
     * Try edges in increasing index order.
     * edge 0 = [V(...,1), V(...,2)]
     * edge 1 = [V(...,2), V(...,3)]
     * etc.
     */
    for (int edge = 0; edge < previous.length; ++edge) {
      final CR[][] candidate = makePolygon(previous[edge], previous[(edge + 1) % previous.length], sides);
      boolean overlap = false;
      for (final CR[][] old : mPolygons) {
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
    throw new IllegalStateException("No valid edge for polygon with " + sides + " sides");
  }
}
