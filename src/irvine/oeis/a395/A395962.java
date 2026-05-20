package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395962 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A395962 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395962() {
    super(1, 0, new A395961(), ZERO);
  }
}
