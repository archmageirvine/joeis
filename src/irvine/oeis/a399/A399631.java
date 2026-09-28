package irvine.oeis.a399;

import irvine.oeis.RecordPositionSequence;

/**
 * A399631 Positions of records in A399629: integers m whose number of divisors d such that the first digit of d equals the last digit of m sets a new record.
 * @author Sean A. Irvine
 */
public class A399631 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A399631() {
    super(1, 1, new A399629());
  }
}

