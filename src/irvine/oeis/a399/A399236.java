package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399236 Squares visited by knight moves on a diagonally numbered Q1 board and always taking the available unvisited square with the shortest distance to the origin, while in the case of a tie the square with smaller row index is preferred. Starting square is labeled 1.
 * @author Sean A. Irvine
 */
public class A399236 extends Sequence1 {

  private static final long[] DELTA_X = {2, 2, -2, -2, 1, 1, -1, -1};
  private static final long[] DELTA_Y = {1, -1, 1, -1, 2, -2, 2, -2};
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mX = 0;
  private long mY = 1;

  private long cantor(final long y, final long x) {
    // This is not standard Cantor! Also, (x,y) are flipped
    return (x * x + 2 * x * y + y * y - x - 3 * y + 2) / 2;
//    final long y = -z;
//    return (x + y) * (x + y + 1) / 2 - y;
  }

  @Override
  public Z next() {
//    System.out.println("C " + cantor(1, 1));
//    System.out.println("C " + cantor(2, 1));
//    System.out.println("C " + cantor(3, 1));
//    System.out.println("C " + cantor(1, 2));
//    System.out.println("C " + cantor(1, 3));
//    System.out.println("C " + cantor(2, 2));
    if (mX == 0) {
      mX = 1;
    } else {
      long dist = Long.MAX_VALUE;
      int bestK = -1;
      for (int k = 0; k < DELTA_X.length; ++k) {
        final long x = mX + DELTA_X[k];
        final long y = mY + DELTA_Y[k];
        if (x > 0 && y > 0) {
          final long cell = cantor(x, y);
          if (!mUsed.contains(cell)) {
            final long r2 = (x - 1) * (x - 1) + (y - 1) * (y - 1); // stupid sequence as origin at (1,1)
            if (r2 < dist || (r2 == dist && y < mY + DELTA_Y[bestK])) {
              dist = r2;
              bestK = k;
            }
          }
        }
      }
      if (bestK < 0) {
        return null;
      }
      mX += DELTA_X[bestK];
      mY += DELTA_Y[bestK];
    }
    final long c = cantor(mX, mY);
    //System.out.println("(" + mX + "," + mY + ") -> " + c);
    mUsed.add(c);
    return Z.valueOf(c);
  }
}
