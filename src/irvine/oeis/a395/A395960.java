package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395960 Numbers k such that A395958(k) = 1.
 * @author Sean A. Irvine
 */
public class A395960 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395960() {
    super(1, 0, new A395958(), ONE);
  }
}
