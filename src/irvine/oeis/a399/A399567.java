package irvine.oeis.a399;

import irvine.oeis.NoncomputableSequence;

/**
 * A399567 Busy Beaver sequence, or Rado's sigma function for 2-state, n-symbol Turing machines: maximal number of nonzero numbers that can be printed on an initially blank tape before halting.
 * @author Gregory Morse
 */
public class A399567 extends NoncomputableSequence {
  // Known exact symbol maxima; no value is returned for the open five-symbol case.
  /** Construct the sequence. */
  public A399567() {
    super(1, NONCOMPUTABLE, 0, 4, 9, 2050);
  }
}
