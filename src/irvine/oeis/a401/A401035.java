package irvine.oeis.a401;

import irvine.oeis.LimitedSumOfPrimePowersSequence;

/**
 * A401035 Numbers that are the sum of 3 cubes of primes in at least 5 ways.
 * @author Sean A. Irvine
 */
public class A401035 extends LimitedSumOfPrimePowersSequence {

  /** Construct the sequence. */
  public A401035() {
    super(3, 3, 5, false, false);
  }
}

