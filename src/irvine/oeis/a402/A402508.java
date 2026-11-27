package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A402508 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402508 extends Sequence0 {

  private static final class Point extends Pair<Long, Long> {

    private Point(final long left, final long right) {
      super(left, right);
    }
  }

  private final Set<Point> mS = new HashSet<>();
  private final Map<Long, List<Point>> mCircles = new HashMap<>();
  private boolean mFirst = true;

  /**
   * Get all integer lattice points on a circle of the given squared radius.
   * @param r2 squared radius
   * @return lattice points
   */
  private List<Point> circle(final long r2) {
    return mCircles.computeIfAbsent(r2, r -> {
      final List<Point> points = new ArrayList<>();
      final long limit = Functions.SQRT.l(r);
      for (long u = -limit; u <= limit; ++u) {
        final long rem = r - u * u;
        final long v = Functions.SQRT.l(rem);
        if (v * v == rem) {
          points.add(new Point(u, v));
          if (v != 0) {
            points.add(new Point(u, -v));
          }
        }
      }
      return points;
    });
  }

  /**
   * Perform one iteration of the construction.
   */
  private void step() {
    final List<Point> p = new ArrayList<>(mS);
    final Set<Point> u = new HashSet<>(mS);
    for (int i = 0; i < p.size(); ++i) {
      final Point a = p.get(i);
      for (int j = i + 1; j < p.size(); ++j) {
        final Point c = p.get(j);
        final long dx = a.left() - c.left();
        final long dy = a.right() - c.right();
        final long r2 = dx * dx + dy * dy;
        for (final Point v : circle(r2)) {
          final long x = a.left() + c.left() + v.left();
          final long y = a.right() + c.right() + v.right();
          if ((x & 1) == 0 && (y & 1) == 0) {
            u.add(new Point(x / 2, y / 2));
          }
        }
      }
    }
    mS.clear();
    mS.addAll(u);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mS.add(new Point(0, 0));
      mS.add(new Point(2, 0));
    } else {
      step();
    }
    return Z.valueOf(mS.size());
  }
}
