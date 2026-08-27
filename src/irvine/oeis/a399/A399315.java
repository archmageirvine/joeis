package irvine.oeis.a399;

import irvine.oeis.a316.A316667;

/**
 * A398717 Squares visited by a "Priest" (Fers + Knight) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A399315 extends A316667 {

  private static final int[] DELTA_X = {2, -2, 2, -2, 2, -2, 0, 0, 1, 2, -1, -2, 1, 2, -1, -2};
  private static final int[] DELTA_Y = {2, 2, -2, -2, 0, 0, 2, -2, 2, 1, 2, 1, -2, -1, -2, -1};

  /** Construct the sequence. */
  public A399315() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
