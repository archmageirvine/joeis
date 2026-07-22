package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397956 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A397956 extends FiniteSequence {

  /** Construct the sequence. */
  public A397956() {
    super(1, FINITE, A397953.polydivisible(6));
  }
}
