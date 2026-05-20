package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;

/**
 * A395960 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A395960 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395960() {
    super(1, 0, new A395958(), ONE);
  }
}
