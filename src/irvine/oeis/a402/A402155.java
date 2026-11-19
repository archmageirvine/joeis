package irvine.oeis.a402;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A402155 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402155 extends Sequence1 {

  private static final int[] DELTA_X = {0, 1, 0, -1};
  private static final int[] DELTA_Y = {-1, 0, 1, 0};
  private static final Point START = new Point(0, 1);
  private final HashMap<Point, Integer> mR = new HashMap<>();

  @Override
  public Z next() {
    Point p = START;
    while (p.right() != 0) {
      final int s = mR.getOrDefault(p, 0);
      mR.put(p, (s + 1) & 3);
      p = new Point(p.left() + DELTA_X[s], p.right() + DELTA_Y[s]);
    }
    return Z.valueOf(p.left());
  }
}
