package irvine.oeis.a396;

import irvine.oeis.DifferenceSequence;

/**
 * A396177 First differences of A396176.
 * @author Sean A. Irvine
 */
public class A396177 extends DifferenceSequence {

  /** Construct the sequence. */
  public A396177() {
    super(1, new A396176());
  }
}

