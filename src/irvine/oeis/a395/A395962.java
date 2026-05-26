package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395962 Numbers k such that A395961(k) = 0.
 * @author Sean A. Irvine
 */
public class A395962 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395962() {
    super(1, 0, new A395961(), ZERO);
  }
}
