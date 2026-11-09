package irvine.oeis.a401;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a003.A003136;

/**
 * A401602 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A401602 extends Sequence2 {

  private final Sequence mL = new A003136().skip();

  private static class Point {
    private final Z mX;
    private final Z mY;

    Point(final Z x, final Z y) {
      mX = x;
      mY = y;
    }

    Point add(final Step s) {
      return new Point(mX.add(s.mDx), mY.add(s.mDy));
    }

    @Override
    public int hashCode() {
      return 31 * mX.hashCode() + mY.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Point)) {
        return false;
      }
      final Point other = (Point) obj;
      return mX.equals(other.mX) && mY.equals(other.mY);
    }
  }

  private static class Step {
    private final long mDx;
    private final long mDy;

    Step(final long dx, final long dy) {
      mDx = dx;
      mDy = dy;
    }
  }

  private static boolean isEisensteinPrime(final Z x, final Z y) {
    final Z norm = x.multiply(x).subtract(x.multiply(y)).add(y.multiply(y));
    if (norm.isProbablePrime()) {
      return true;
    }
    final Z q;
    if (y.isZero()) {
      q = x.abs();
    } else if (x.isZero() || x.equals(y)) {
      q = y.abs();
    } else {
      return false;
    }
    return q.mod(Z.THREE).equals(Z.TWO) && q.isProbablePrime();
  }

  @Override
  public Z next() {
    final long n = mL.next().longValueExact();
    // Generate all permitted displacement vectors
    final List<Step> steps = new ArrayList<>();
    for (long dx = -n; dx <= n; ++dx) {
      for (long dy = -n; dy <= n; ++dy) {
        final long norm = dx * dx - dx * dy + dy * dy;
        if (norm > 0 && norm <= n) {
          steps.add(new Step(dx, dy));
        }
      }
    }
    // Depth-first search from the origin
    final Set<Point> seen = new HashSet<>();
    final ArrayDeque<Point> todo = new ArrayDeque<>();
    final Point origin = new Point(Z.ZERO, Z.ZERO);
    seen.add(origin);
    todo.push(origin);
    while (!todo.isEmpty()) {
      final Point p = todo.pop();
      for (final Step s : steps) {
        final Point v = p.add(s);
        if (!seen.contains(v) && isEisensteinPrime(v.mX, v.mY)) {
          seen.add(v);
          todo.push(v);
        }
      }
    }
    return Z.valueOf(seen.size() - 1);
  }
}
