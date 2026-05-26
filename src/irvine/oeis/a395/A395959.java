package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395959 Numbers k such that A395958(k) = 0.
 * @author Sean A. Irvine
 */
public class A395959 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395959() {
    super(1, 0, new A395958(), ZERO);
  }
}
