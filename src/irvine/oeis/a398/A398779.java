package irvine.oeis.a398;

import irvine.oeis.a316.A316667;

/**
 * A398779 Squares visited by a "(1,2)+(2,2)Leaper" (Knight + Alfil) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A398779 extends A316667 {

  private static final int[] DELTA_X = {2, -2, 2, -2, 1, 1, -1, -1, 2, 2, -2, -2};
  private static final int[] DELTA_Y = {2, 2, -2, -2, 2, -2, 2, -2, 1, -1, 1, -1};

  /** Construct the sequence. */
  public A398779() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
