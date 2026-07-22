package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397954 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A397954 extends FiniteSequence {

  /** Construct the sequence. */
  public A397954() {
    super(1, FINITE, A397953.polydivisible(4));
  }
}
