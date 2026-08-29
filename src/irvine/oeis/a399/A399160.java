package irvine.oeis.a399;

import irvine.oeis.a316.A316667;

/**
 * A399160 Squares visited by a "Falafel" (Fers + Alfil) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A399160 extends A316667 {

  private static final int[] DELTA_X = {1, 1, -1, -1, 2, 2, -2, -2};
  private static final int[] DELTA_Y = {1, -1, 1, -1, 2, -2, 2, -2};

  /** Construct the sequence. */
  public A399160() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
