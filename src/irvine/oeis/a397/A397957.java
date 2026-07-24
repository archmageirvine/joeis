package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397957 Polydivisible numbers in base 7.
 * @author Sean A. Irvine
 */
public class A397957 extends FiniteSequence {

  /** Construct the sequence. */
  public A397957() {
    super(1, FINITE, A397953.polydivisible(7));
  }
}
