package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401753.
 * @author Sean A. Irvine
 */
public class A401753 extends Sequence1 {

  private static final int UNVISITED = 0;
  private static final int BLACK = 1;
  private static final int WHITE = 2;
  private static final int[] DX = {0, 1, 0, -1};
  private static final int[] DY = {-1, 0, 1, 0};
  private int mN = 0;
  private int mM = 0;
  private int mMax = 0;
  private int[][] mGrid = null;

  private void search(final int x, final int y, int d, final int steps) {
    if (x < 0 || y < 0 || x >= mM || y >= mN) {
      if (steps > mMax) {
        mMax = steps;
      }
      return;
    }
    switch (mGrid[x][y]) {
      case UNVISITED:
        // We need to try each of the possible colors
        // Simply recurse with each choice in turn
        mGrid[x][y] = BLACK;
        search(x, y, d, steps);
        mGrid[x][y] = WHITE;
        search(x, y, d, steps);
        mGrid[x][y] = UNVISITED;
        break;
      case BLACK:
        d = ++d & 3;
        mGrid[x][y] = 3 - mGrid[x][y]; // toggle color
        search(x + DX[d], y + DY[d], d, steps + 1);
        mGrid[x][y] = 3 - mGrid[x][y]; // untoggle color
        break;
      case WHITE:
        d = --d & 3;
        mGrid[x][y] = 3 - mGrid[x][y]; // toggle color
        search(x + DX[d], y + DY[d], d, steps + 1);
        mGrid[x][y] = 3 - mGrid[x][y]; // untoggle color
        break;
      default:
        throw new RuntimeException(); // impossible
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    mMax = 0;
    mGrid = new int[mM][mN];
    for (int x = 0; 2 * x < mM; ++x) {
      for (int y = 0; 2 * y < mN; ++y) {
        for (int d = 0; d < 4; ++d) {
          search(x, y, d, 0);
        }
      }
    }
    return Z.valueOf(mMax);
  }
}
