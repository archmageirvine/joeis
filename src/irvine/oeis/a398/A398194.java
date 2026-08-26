package irvine.oeis.a398;

import irvine.oeis.a316.A316667;

/**
 * A316667.
 * @author Sean A. Irvine
 */
public class A398194 extends A316667 {

  private static final int[] DELTA_X = {1, -1, 1, -1, 2, -2, 0, 0, 1, 2, -1, -2, 1, 2, -1, -2};
  private static final int[] DELTA_Y = {1, 1, -1, -1, 0, 0, 2, -2, 2, 1, 2, 1, -2, -1, -2, -1};

  /** Construct the sequence. */
  public A398194() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
