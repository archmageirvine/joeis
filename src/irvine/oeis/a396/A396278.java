package irvine.oeis.a396;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a081.A081973;

/**
 * A396278 Numbers k such that A081973(k) is prime.
 * @author Sean A. Irvine
 */
public class A396278 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A396278() {
    super(1, new A081973(), PRIME);
  }
}

