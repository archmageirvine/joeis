package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397958 Polydivisible numbers in base 8.
 * @author Sean A. Irvine
 */
public class A397958 extends FiniteSequence {

  /** Construct the sequence. */
  public A397958() {
    super(1, FINITE, A397953.polydivisible(8));
  }
}
