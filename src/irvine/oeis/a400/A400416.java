package irvine.oeis.a400;

import irvine.oeis.RecordPositionSequence;

/**
 * A400416 Indices of record terms of A400415.
 * @author Sean A. Irvine
 */
public class A400416 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A400416() {
    super(1, new A400415(), 1, false);
  }
}
