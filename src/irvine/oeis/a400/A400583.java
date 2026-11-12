package irvine.oeis.a400;

import irvine.oeis.RecordPositionSequence;

/**
 * A400583 allocated for Siegfried Pohl.
 * @author Sean A. Irvine
 */
public class A400583 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A400583() {
    super(1, 1, new A400943());
  }
}
