package irvine.oeis.a400;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002275;

/**
 * A400298 allocated for Vicenzo P DeMaar.
 * @author Sean A. Irvine
 */
public class A400298 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A002275());

  /** Construct the sequence. */
  public A400298() {
    super(1, 1, 1, (j, k) -> j <= k ? S.a(k).multiply(S.a(j)) : null);
  }
}
