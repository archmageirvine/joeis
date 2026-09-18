package irvine.oeis.a399;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A399796 allocated for Eddie Lin Rui.
 * @author Sean A. Irvine
 */
public class A399796 extends Sequence0 {

  private HashMap<Point, Z> mCounts = new HashMap<>();

  @Override
  public Z next() {
    if (mCounts.isEmpty()) {
      mCounts.put(new Point(0, 0), Z.ONE);
    } else {
      final HashMap<Point, Z> next = new HashMap<>(mCounts);
      for (final Map.Entry<Point, Z> e : mCounts.entrySet()) {
        final int x = e.getKey().left();
        final int y = e.getKey().right();
        final Z c = e.getValue();
        next.merge(new Point(x + 1, y), c, Z::add);
        next.merge(new Point(x - 1, y), c, Z::add);
        next.merge(new Point(x, y + 1), c, Z::add);
        next.merge(new Point(x, y - 1), c, Z::add);
      }
      mCounts = next;
    }
    return Z.valueOf(new HashSet<>(mCounts.values()).size());
  }
}
