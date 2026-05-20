package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395963 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A395963 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395963() {
    super(1, 0, new A395961(), ONE);
  }
}
