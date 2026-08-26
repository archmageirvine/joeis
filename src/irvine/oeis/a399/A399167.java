package irvine.oeis.a399;

import irvine.oeis.a316.A316667;

/**
 * A399167 allocated for Jens Ahlstr\u00f6m.
 * @author Sean A. Irvine
 */
public class A399167 extends A316667 {

  private static final int[] DELTA_X = {-2, -2, 2, 2, -1, -1, 1, 1, 1, 2, -1, -2, 1, 2, -1, -2};
  private static final int[] DELTA_Y = {-2, 2, -2, 2, -1, 1, -1, 1, 2, 1, 2, 1, -2, -1, -2, -1};

  /** Construct the sequence. */
  public A399167() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
