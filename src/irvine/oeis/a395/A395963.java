package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395963 Numbers k such that A395961(k) = 1.
 * @author Sean A. Irvine
 */
public class A395963 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395963() {
    super(1, 0, new A395961(), ONE);
  }
}
