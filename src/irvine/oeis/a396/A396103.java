package irvine.oeis.a396;

import irvine.oeis.a316.A316667;

/**
 * A396103 Squares visited by a "Spider" (Fers + Alfil + Dabbaba + Knight) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A396103 extends A316667 {

  private static final int[] DELTA_X = {1, -1, 1, -1, 2, -2, 2, -2, 1, 1, -1, -1, 2, 2, -2, -2, 2, -2, 0, 0};
  private static final int[] DELTA_Y = {1, 1, -1, -1, 2, 2, -2, -2, 2, -2, 2, -2, 1, -1, 1, -1, 0, 0, 2, -2};

  /** Construct the sequence. */
  public A396103() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
