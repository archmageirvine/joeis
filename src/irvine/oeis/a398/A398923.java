package irvine.oeis.a398;

import irvine.oeis.PartialSumSequence;

/**
 * A398923 Number of distinct acute lattice trapezia of area at most n/2 with horizontal base.
 * @author Sean A. Irvine
 */
public class A398923 extends PartialSumSequence {

  /** Construct the sequence. */
  public A398923() {
    super(1, new A398922());
  }
}
