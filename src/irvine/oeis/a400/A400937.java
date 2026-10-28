package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400937 Squares visited by knight moves on a diagonally numbered Q1 board and always taking the available unvisited square with the shortest distance to the bisecting line of Q1. In the case of a tie, first squares with the larger row index are preferred, second the square with larger column index is preferred. Starting square is labeled 1.
 * @author Sean A. Irvine
 */
public class A400937 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((9 * ++mN * mN - 12 * mN + 6) / 2);
  }
}

