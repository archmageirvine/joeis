package irvine.oeis.a399;

import irvine.oeis.RecordPositionSequence;

/**
 * A399887 Indices of record high points in A399184.
 * @author Sean A. Irvine
 */
public class A399887 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A399887() {
    super(1, new A399184(), 1, false);
  }
}
