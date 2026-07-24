package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397955 Polydivisible numbers in base 5.
 * @author Sean A. Irvine
 */
public class A397955 extends FiniteSequence {

  /** Construct the sequence. */
  public A397955() {
    super(1, FINITE, A397953.polydivisible(5));
  }
}
