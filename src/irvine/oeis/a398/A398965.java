package irvine.oeis.a398;

import irvine.oeis.a316.A316667;

/**
 * A398965 Squares visited by a "Carpenter" (Dabbaba + Knight) moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A398965 extends A316667 {

  private static final int[] DELTA_X = {2, -2, 0, 0, 1, 2, -1, -2, 1, 2, -1, -2};
  private static final int[] DELTA_Y = {0, 0, -2, 2, 2, 1, 2, 1, -2, -1, -2, -1};

  /** Construct the sequence. */
  public A398965() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
