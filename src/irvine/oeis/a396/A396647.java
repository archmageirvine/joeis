package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396647 Numbers k = p_1^e_1 * ... * p_i^e_i such that the area of the convex hull of the planar coordinates [p_i, e_i] is not an integer, but &gt;= 1/2.
 * @author Sean A. Irvine
 */
public class A396647 extends Sequence1 {

  private long mN = 1;

  static class Point {
    final long mX;
    final long mY;

    Point(final long x, final long y) {
      mX = x;
      mY = y;
    }

    @Override
    public String toString() {
      return "(" + mX + "," + mY + ")";
    }
  }

  private static long cross(final Point o, final Point a, final Point b) {
    return (a.mX - o.mX) * (b.mY - o.mY) - (a.mY - o.mY) * (b.mX - o.mX);
  }

  static List<Point> convexHull(final List<Point> pts) {
    if (pts.size() <= 1) {
      return pts;
    }
    final List<Point> p = new ArrayList<>(pts);
    p.sort(Comparator.comparingLong((Point q) -> q.mX).thenComparingLong(q -> q.mY));
    final List<Point> lower = new ArrayList<>();
    for (final Point pt : p) {
      while (lower.size() >= 2 && cross(lower.get(lower.size() - 2), lower.get(lower.size() - 1), pt) <= 0) {
        lower.remove(lower.size() - 1);
      }
      lower.add(pt);
    }

    final List<Point> upper = new ArrayList<>();
    for (int k = p.size() - 1; k >= 0; --k) {
      final Point pt = p.get(k);
      while (upper.size() >= 2 && cross(upper.get(upper.size() - 2), upper.get(upper.size() - 1), pt) <= 0) {
        upper.remove(upper.size() - 1);
      }
      upper.add(pt);
    }

    lower.remove(lower.size() - 1);
    upper.remove(upper.size() - 1);
    lower.addAll(upper);
    return lower;
  }

  static long twiceArea(final List<Point> poly) {
    long s = 0;
    for (int k = 0; k < poly.size(); ++k) {
      final Point a = poly.get(k);
      final Point b = poly.get((k + 1) % poly.size());
      s += a.mX * b.mY - a.mY * b.mX;
    }
    return Math.abs(s);
  }

  protected boolean accept(final long area) {
    return (area & 1) == 1;
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() < 3) {
        continue;
      }
      final List<Point> pts = new ArrayList<>();
      for (final Z p : fs.toZArray()) {
        pts.add(new Point(p.longValue(), fs.getExponent(p)));
      }
      final List<Point> hull = convexHull(pts);
      if (hull.size() < 3) {
        continue;
      }
      if (accept(twiceArea(hull))) {
        return Z.valueOf(mN);
      }
    }
  }
}
