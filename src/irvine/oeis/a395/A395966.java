package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395966 Numbers k such that A395964(k) = 1.
 * @author Sean A. Irvine
 */
public class A395966 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395966() {
    super(1, 0, new A395964(), ONE);
  }
}
