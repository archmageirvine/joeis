package irvine.oeis.a396;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A396379 Fixed points of A396378: integers m so that m is the smallest integer of the interval (m, m+1, ..., m+A396377(m)) that divides the product of the other integers.
 * @author Sean A. Irvine
 */
public class A396379 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A396379() {
    super(1, new A396378());
  }
}
