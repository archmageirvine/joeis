package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.CachedCyclotomicExtension;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401327: Folding polygons.
 * @author Sean A. Irvine
 */
public class A401327 extends Sequence3 {

  // A simple floating-point version of all this is significantly faster, but I
  // didn't have complete confidence in the results.  This one should be exact
  // but despite all my caching is still very slow.

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /**
   * Exact search for the maximum number of legal folds of a regular polygon.
   */
  private static final class FoldingSearch {

    private final int mN;
    private final CachedCyclotomicExtension mField;
    private final Polynomial<Q> mZ;
    private final Map<String, Integer> mCache = new HashMap<>();
    private final Polynomial<Q> mInvS;

    // Precompute some values for a polygon to avoid repeated calculation
    private final class Geometry {
      private final List<Polynomial<Q>> mReflectionRatios = new ArrayList<>();
      private final byte[][][] mOrientations;

      private Geometry(final List<Polynomial<Q>> polygon) {
        final int n = polygon.size();
        for (int k = 0; k < n; ++k) {
          final Polynomial<Q> a = polygon.get((k + n - 1) % n);
          final Polynomial<Q> b = polygon.get((k + 1) % n);
          final Polynomial<Q> d = mField.subtract(b, a);
          if (mField.isZero(d)) {
            mReflectionRatios.add(null);
          } else {
            mReflectionRatios.add(mField.divide(d, mField.conjugate(d)));
          }
        }
        mOrientations = new byte[n][n][n];
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            Arrays.fill(mOrientations[i][j], (byte) 2);
          }
        }
      }

      Polynomial<Q> reflectionRatio(final int k) {
        return mReflectionRatios.get(k);
      }

      int orientation(final List<Polynomial<Q>> polygon, final int i, final int j, final int k) {
        byte result = mOrientations[i][j][k];
        if (result == 2) {
          result = (byte) FoldingSearch.this.orientation(polygon.get(i), polygon.get(j), polygon.get(k));
          mOrientations[i][j][k] = result;
        }
        return result;
      }
    }

    FoldingSearch(final int n) {
      mN = n;
      mField = new CachedCyclotomicExtension(n);
      mZ = mField.x();
      final Polynomial<Q> s = mField.subtract(mZ, mField.conjugate(mZ));
      mInvS = mField.inverse(s);
    }

    /**
     * Compute the maximum number of folds.
     * @return maximum number of folds
     */
    int compute() {
      if (mN == 3) {
        return 0;
      }
      final List<Polynomial<Q>> polygon = new ArrayList<>();
      for (int k = 0; k < mN; ++k) {
        polygon.add(mField.pow(mZ, k));
      }
      final Geometry geometry = new Geometry(polygon);
      // By rotational symmetry, the first fold can be at vertex 0
      final List<Polynomial<Q>> folded = fold(polygon, geometry, 0);
      if (!isSimple(folded, new Geometry(folded)) || mField.compare(area(folded), area(polygon)) >= 0) {
        return 0;
      }
      final int res = search(folded);
      if (VERBOSE) {
        mField.reportStats();
      }
      return 1 + res;
    }

    private Polynomial<Q> reflect(final Polynomial<Q> a, final Polynomial<Q> conjugateP, final Polynomial<Q> conjugateA, final Polynomial<Q> ratio) {
      return mField.add(a, mField.multiply(ratio, mField.subtract(conjugateP, conjugateA)));
    }

    /**
     * Fold one vertex.
     * @param polygon polygon
     * @param vertex vertex to fold
     * @return new polygon, or null if the fold is degenerate
     */
    private List<Polynomial<Q>> fold(final List<Polynomial<Q>> polygon, final Geometry geometry, final int vertex) {
      final int n = polygon.size();
      final int previous = (vertex + n - 1) % n;
      final Polynomial<Q> a = polygon.get(previous);
      final List<Polynomial<Q>> result = new ArrayList<>(polygon);
      final Polynomial<Q> ratio = geometry.reflectionRatio(vertex);
      if (ratio == null) {
        return null;
      }
      result.set(vertex, reflect(a, mField.conjugate(polygon.get(vertex)), mField.conjugate(a), ratio));
      return result;
    }

    /**
     * Sign of the imaginary part of an element.
     * The result is obtained entirely within the real cyclotomic field.
     * @param w field element
     * @return sign of imaginary part
     */
    private int imaginarySign(final Polynomial<Q> w) {
      final Polynomial<Q> numerator = mField.subtract(w, mField.conjugate(w));
      return mField.signum(mField.multiply(numerator, mInvS));
    }

    /**
     * Orientation of three points.
     * @return -1, 0, or 1
     */
    private int orientation(final Polynomial<Q> a, final Polynomial<Q> b, final Polynomial<Q> c) {
      final Polynomial<Q> u = mField.subtract(b, a);
      final Polynomial<Q> v = mField.subtract(c, a);
      return imaginarySign(mField.multiply(mField.conjugate(u), v));
    }

    /**
     * Test whether p lies on the closed segment ab.
     * Assumes that a, b, p are collinear.
     */
    private boolean onSegment(final Polynomial<Q> a, final Polynomial<Q> b, final Polynomial<Q> p) {
      final Polynomial<Q> u = mField.subtract(p, a);
      final Polynomial<Q> v = mField.subtract(p, b);
      final Polynomial<Q> dot = mField.multiply(mField.conjugate(u), v);
      // dot is real; p is between a and b exactly when dot <= 0.
      return mField.signum(dot) <= 0;
    }

    /**
     * Test whether two closed segments intersect.
     */
    private boolean intersects(final List<Polynomial<Q>> polygon, final Geometry geometry, final int i, final int j, final int k, final int l) {
      final int o1 = geometry.orientation(polygon, i, j, k);
      final int o2 = geometry.orientation(polygon, i, j, l);
      final int o3 = geometry.orientation(polygon, k, l, i);
      final int o4 = geometry.orientation(polygon, k, l, j);
      if (o1 * o2 < 0 && o3 * o4 < 0) {
        return true;
      }
      final Polynomial<Q> a = polygon.get(i);
      final Polynomial<Q> b = polygon.get(j);
      final Polynomial<Q> c = polygon.get(k);
      final Polynomial<Q> d = polygon.get(l);
      return (o1 == 0 && onSegment(a, b, c))
        || (o2 == 0 && onSegment(a, b, d))
        || (o3 == 0 && onSegment(c, d, a))
        || (o4 == 0 && onSegment(c, d, b));
    }

    /**
     * Test whether a polygon is simple.
     */
    private boolean isSimple(final List<Polynomial<Q>> polygon, final Geometry geometry) {
      final int n = polygon.size();

      // Reject zero-length edges.
      for (int k = 0; k < n; ++k) {
        if (polygon.get(k).equals(polygon.get((k + 1) % n))) {
          return false;
        }
      }

      // Reject adjacent edges which overlap rather than just meeting
      // at their common endpoint.
      for (int k = 0; k < n; ++k) {
        final int i = (k + n - 1) % n;
        final int j = (k + 1) % n;
        if (geometry.orientation(polygon, i, k, j) == 0) {
          final Polynomial<Q> a = polygon.get(i);
          final Polynomial<Q> b = polygon.get(k);
          final Polynomial<Q> c = polygon.get(j);
          if (!onSegment(a, c, b)) {
            return false;
          }
        }
      }

      // Non-adjacent edges must be disjoint, including at endpoints.
      for (int i = 0; i < n; ++i) {
        final int ii = (i + 1) % n;
        for (int j = i + 1; j < n; ++j) {
          if (j == i + 1 || (i == 0 && j == n - 1)) {
            continue;
          }
          if (intersects(polygon, geometry, i, ii, j, (j + 1) % n)) {
            return false;
          }
        }
      }

      // A simple polygon cannot have zero area.
      return !mField.isZero(signedArea(polygon));
    }

    /**
     * Twice the signed area, divided by sin(2 pi / n).
     * This is a positive constant multiple of the actual signed area.
     */
    private Polynomial<Q> signedArea(final List<Polynomial<Q>> polygon) {
      Polynomial<Q> sum = mField.zero();
      for (int k = 0; k < polygon.size(); ++k) {
        final Polynomial<Q> a = polygon.get(k);
        final Polynomial<Q> b = polygon.get((k + 1) % polygon.size());
        sum = mField.add(sum, mField.multiply(mField.conjugate(a), b));
      }
      return mField.multiply(mField.subtract(sum, mField.conjugate(sum)), mInvS);
    }

    /**
     * Absolute area, up to a fixed positive factor.
     */
    private Polynomial<Q> area(final List<Polynomial<Q>> polygon) {
      final Polynomial<Q> a = signedArea(polygon);
      return mField.signum(a) < 0 ? mField.subtract(mField.zero(), a) : a;
    }

    /**
     * Canonical key, invariant under cyclic permutation and reversal.
     */
    private String key(final List<Polynomial<Q>> polygon) {
      final int n = polygon.size();
      String best = null;
      for (int direction = -1; direction <= 1; direction += 2) {
        for (int start = 0; start < n; ++start) {
          final StringBuilder sb = new StringBuilder();
          for (int k = 0; k < n; ++k) {
            final int index = (start + direction * k + n) % n;
            final String s = polygon.get(index).toString();
            sb.append(s.length()).append(':').append(s).append(';');
          }
          final String candidate = sb.toString();
          if (best == null || candidate.compareTo(best) < 0) {
            best = candidate;
          }
        }
      }
      return best;
    }

    /**
     * Maximum number of additional folds possible from this state.
     */
    private int search(final List<Polynomial<Q>> polygon) {
      final String key = key(polygon);
      final Integer cached = mCache.get(key);
      if (cached != null) {
        return cached;
      }

      final Polynomial<Q> oldArea = area(polygon);
      int best = 0;

      final Geometry geometry = new Geometry(polygon);
      for (int k = 0; k < mN; ++k) {
        final List<Polynomial<Q>> next = fold(polygon, geometry, k);
        final Geometry nextGeometry = new Geometry(next);
        if (isSimple(next, nextGeometry) && mField.compare(area(next), oldArea) < 0) {
          best = Math.max(best, 1 + search(next));
        }
      }

      mCache.put(key, best);
      return best;
    }
  }

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(new FoldingSearch(++mN).compute());
  }
}
