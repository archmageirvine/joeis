package irvine.oeis.a401;

import irvine.oeis.FilterPositionSequence;

/**
 * A401250 Numbers k such that the minimum number of odd terms in a 2-dense sublist of divisors of k is greater than 1.
 * @author Sean A. Irvine
 */
public class A401250 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401250() {
    super(1, 1, new A401249(), k -> !k.isOne());
  }
}

