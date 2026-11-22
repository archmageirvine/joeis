package irvine.oeis.a399;

import irvine.oeis.NoncomputableSequence;

/**
 * A399884 Variant of the Busy Beaver sequence for the Post correspondence problem.
 * @author Gregory Morse
 */
public class A399884 extends NoncomputableSequence {
  // Known exact maxima; see Rahn's thesis and Zhao's paper in the OEIS entry.
  /** Construct the sequence. */
  public A399884() {
    super(0, NONCOMPUTABLE, 0, 1, 2, 75);
  }
}
