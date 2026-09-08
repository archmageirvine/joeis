package irvine.oeis.a397;

import irvine.oeis.PartialSumSequence;

/**
 * A397086 Partial sums of A397085.
 * @author Sean A. Irvine
 */
public class A397086 extends PartialSumSequence {

  /** Construct the sequence. */
  public A397086() {
    super(0, new A397085());
  }
}

