package irvine.oeis.a401;

import irvine.oeis.RecordPositionSequence;

/**
 * A401990 Position of records in A401489: integers m whose number of divisors d that are brilliant sets a new record.
 * @author Sean A. Irvine
 */
public class A401990 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A401990() {
    super(1, 1, new A401489());
  }
}
