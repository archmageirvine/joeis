package irvine.oeis.a401;

import irvine.oeis.NoncomputableSequence;

/**
 * A401603 Maximum number of instructions executed before executing the halting instruction at the end of a halting computation of an n-instruction register Minsky machine.
 * @author Gregory Morse
 */
public class A401603 extends NoncomputableSequence {
  // Published exact Minsky machine values; later lower bounds are not terms.
  /** Construct the sequence. */
  public A401603() {
    super(1, NONCOMPUTABLE, 0, 1, 3, 5, 10, 24, 49, 231);
  }
}
