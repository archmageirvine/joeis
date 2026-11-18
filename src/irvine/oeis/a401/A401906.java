package irvine.oeis.a401;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a400.A400463;

/**
 * A401906 Numbers not of the form abs(k - reversal of k in base 2) for at least one k (written in base 10).
 * @author Sean A. Irvine
 */
public class A401906 extends ComplementSequence {

  /** Construct the sequence. */
  public A401906() {
    super(1, new A400463());
  }
}
