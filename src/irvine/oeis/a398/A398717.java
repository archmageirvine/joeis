package irvine.oeis.a398;

import irvine.oeis.a316.A316667;

/**
 * A398717 Squares visited by a "Priest" (Fers + Knight) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A398717 extends A316667 {

  private static final int[] DELTA_X = {1, -1, 1, -1, 1, 1, -1, -1, 2, 2, -2, -2};
  private static final int[] DELTA_Y = {1, 1, -1, -1, 2, -2, 2, -2, 1, -1, 1, -1};

  /** Construct the sequence. */
  public A398717() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
