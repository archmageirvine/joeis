package irvine.oeis.a398;

import irvine.oeis.FiniteSequence;

/**
 * A398900 Prime numbers that can be written as half the sum of three squares in exactly one unique way.
 * @author Sean A. Irvine
 */
public class A398900 extends FiniteSequence {

  /** Construct the sequence. */
  public A398900() {
    super(1, FINITE, 2, 3, 5, 7, 11, 23, 29, 71);
  }
}
