package irvine.oeis.a398;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A398172 Number of subsets of the n X n grid with no three collinear points (the empty set is counted).
 * @author Sean A. Irvine
 */
public class A398172 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void mark(final int[][] blocked, final ArrayList<Point> pts, final int x, final int y, final int increment) {
    blocked[x][y] += increment;
    for (final Point pt : pts) {
      final int x0 = pt.left();
      final int y0 = pt.right();
      final int dx = x - x0;
      final int dy = y - y0;
      final int g = Functions.GCD.i(dx, dy);
      final int tx = dx / g;
      final int ty = dy / g;
      int nx = x + tx;
      int ny = y + ty;
      while (nx >= 0 && ny >= 0 && nx < mN && ny < mN) {
        blocked[nx][ny] += increment;
        nx += tx;
        ny += ty;
      }
      nx = x - tx;
      ny = y - ty;
      while (nx >= 0 && ny >= 0 && nx < mN && ny < mN) {
        blocked[nx][ny] += increment;
        nx -= tx;
        ny -= ty;
      }
    }
  }

  private void search(final int[][] blocked, final ArrayList<Point> pts, final int x, final int y) {
    if (y >= mN) {
      ++mCount;
      return;
    }
    if (x >= mN) {
      search(blocked, pts, 0, y + 1);
      return;
    }
    search(blocked, pts, x + 1, y);
    if (blocked[x][y] == 0) {
      mark(blocked, pts, x, y, 1);
      pts.add(new Point(x, y));
      search(blocked, pts, x + 1, y);
      pts.remove(pts.size() - 1);
      mark(blocked, pts, x, y, -1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(new int[mN][mN], new ArrayList<>(), 0, 0);
    return Z.valueOf(mCount);
  }
}
