package irvine.oeis.a401;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A401902 Number of sites that topple when the 2n-th grain is added at the origin of an initially empty sandpile on the first quadrant, where a site (x, y) with at least 2 grains topples by sending one grain to each of (x+1, y) and (x, y+1).
 * @author Sean A. Irvine
 */
public class A401902 extends Sequence1 {

  // After Alper Ferudun

  private static final Point ORIGIN = new Point(0, 0);
  private final HashMap<Point, Integer> mH = new HashMap<>();

  private void addGrain(final Deque<Point> q, final Point pt) {
    if (mH.merge(pt, 1, Integer::sum) == 2) {
      q.add(pt);
    }
  }

  @Override
  public Z next() {
    mH.merge(ORIGIN, 2, Integer::sum);
    final Deque<Point> q = new LinkedList<>();
    q.add(ORIGIN);
    final HashSet<Point> toppled = new HashSet<>();
    while (!q.isEmpty()) {
      final Point pt = q.pollFirst();
      final int x = pt.left();
      final int y = pt.right();
      while (mH.get(pt) >= 2) {
        mH.merge(pt, -2, Integer::sum);
        toppled.add(pt);
        addGrain(q, new Point(x + 1, y));
        addGrain(q, new Point(x, y + 1));
      }
    }
    return Z.valueOf(toppled.size());
  }
}
