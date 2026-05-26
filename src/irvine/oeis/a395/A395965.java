package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395965 Numbers k such that A395964(k) = 0.
 * @author Sean A. Irvine
 */
public class A395965 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395965() {
    super(1, 0, new A395964(), ZERO);
  }
}
