package irvine.oeis.a398;

import irvine.oeis.NoncomputableSequence;

/**
 * A398770 Busy beaver number of BB(2,n): the maximal number of steps that an 2-state, n-symbol Turing machine can make on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A398770 extends NoncomputableSequence {
  // The unary case and the verified values from Coq-BB5 v1.0.0.
  /** Construct the sequence. */
  public A398770() {
    super(1, NONCOMPUTABLE, 2, 6, 38, 3932964);
  }
}
