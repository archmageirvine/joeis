package irvine.oeis.a397;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a093.A093811;

/**
 * A397260 Indices of records in A093811.
 * @author Sean A. Irvine
 */
public class A397260 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A397260() {
    super(1, 1, new A093811());
  }
}
