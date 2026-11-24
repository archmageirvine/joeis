package irvine.oeis.a402;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A402282 Numbers k such that the walk on the square lattice encoded by the binary expansion of k ends at a point not reached by the walk of any smaller positive integer.
 * @author Sean A. Irvine
 */
public class A402282 extends Sequence1 {

  private final HashSet<Point> mSeen = new HashSet<>();
  private long mN = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mLim) {
        mLim *= 2;
      }
      int x = 0;
      int y = 0;
      int dx = 0;
      int dy = 1;
      for (long t = mLim >>> 1; t > 0; t >>>= 1) {
        final int dt = dx;
        if ((mN & t) == 0) {
          dx = -dy;
          dy = dt;
        } else {
          dx = dy;
          dy = -dt;
        }
        x += dx;
        y += dy;
      }
      if (mSeen.add(new Point(x, y))) {
        return Z.valueOf(mN);
      }
    }
  }
}
