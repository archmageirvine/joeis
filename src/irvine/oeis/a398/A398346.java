package irvine.oeis.a398;

import irvine.oeis.FiniteSequence;

/**
 * A398346 Numbers with at least two digits, whose second and last digits are nonzero, that divide every number obtained by inserting any number of 0's between their first and second digits.
 * @author Sean A. Irvine
 */
public class A398346 extends FiniteSequence {

  /** Construct the sequence. */
  public A398346() {
    super(1, FINITE, 15, 18, 45, 225, 675, 1125, 3375, 5625, 7875);
  }
}

