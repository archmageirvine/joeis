package irvine.oeis.a396;

import irvine.oeis.DifferenceSequence;

/**
 * A396104 allocated for Patrick Bini.
 * @author Sean A. Irvine
 */
public class A396104 extends DifferenceSequence {

  /** Construct the sequence. */
  public A396104() {
    super(0, new A396086());
  }
}
