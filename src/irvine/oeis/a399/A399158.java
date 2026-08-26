package irvine.oeis.a399;

import irvine.oeis.a316.A316667;

/**
 * A399158 Squares visited by a Dabbaba moving on a spirally numbered board always to the lowest available unvisited square.
 * @author Sean A. Irvine
 */
public class A399158 extends A316667 {

  private static final int[] DELTA_X = {2, -2, 0, 0};
  private static final int[] DELTA_Y = {0, 0, -2, 2};

  /** Construct the sequence. */
  public A399158() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
