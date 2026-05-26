package irvine.oeis.a396;

import irvine.oeis.DifferenceSequence;

/**
 * A396104 First differences of A396086, the number of dyadic intervals of length 2^(-n) that intersect the classical middle-third Cantor set.
 * @author Sean A. Irvine
 */
public class A396104 extends DifferenceSequence {

  /** Construct the sequence. */
  public A396104() {
    super(0, new A396086());
  }
}
