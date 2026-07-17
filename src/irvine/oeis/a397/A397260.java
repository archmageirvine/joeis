package irvine.oeis.a397;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a093.A093811;

/**
 * A397260 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A397260 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A397260() {
    super(1, 1, new A093811());
  }
}
