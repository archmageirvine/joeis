package irvine.oeis.a402;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001481;

/**
 * A402096 Number of primes of Z[sqrt(2)] reachable from 0 by steps of length at most sqrt(A001481(n)), stepping only on primes.
 * @author Sean A. Irvine
 */
public class A402096 extends Sequence1 {

  private final Sequence mL = new A001481();

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

  private static boolean isSqrt2Prime(final Z x, final Z y) {
    final Z n = x.square().subtract(y.square().multiply2()).abs();
    if (n.isProbablePrime()) {
      return true;
    }
    if (!n.isSquare()) {
      return false;
    }
    final Z q = n.sqrt();
    final long r = q.mod(8);
    return (r == 3 || r == 5) && q.isProbablePrime();
  }

  @Override
  public Z next() {
    final long n = mL.next().longValueExact();
    // Generate all permitted displacement vectors
    final List<Step> steps = new ArrayList<>();
    for (long dx = -n; dx <= n; ++dx) {
      for (long dy = -n; dy <= n; ++dy) {
        final long norm = dx * dx + dy * dy;
        if (norm <= n) {
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
        if (!seen.contains(v) && isSqrt2Prime(v.mX, v.mY)) {
          seen.add(v);
          todo.push(v);
        }
      }
    }
    return Z.valueOf(seen.size() - 1);
  }
}
