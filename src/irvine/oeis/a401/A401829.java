package irvine.oeis.a401;

import irvine.oeis.DifferenceSequence;

/**
 * A401828: Population of the B2/S34/C4 automaton.
 * @author Sean A. Irvine
 */
public class A401829 extends DifferenceSequence {

  /** Construct the sequence. */
  public A401829() {
    super(0, new A401828());
  }
}
