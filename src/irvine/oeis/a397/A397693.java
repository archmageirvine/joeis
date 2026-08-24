package irvine.oeis.a397;

import irvine.oeis.RecordPositionSequence;

/**
 * A397693 Indices of records in A397887.
 * @author Sean A. Irvine
 */
public class A397693 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A397693() {
    super(1, 1, new A397887());
  }
}
