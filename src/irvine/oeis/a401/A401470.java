package irvine.oeis.a401;

import irvine.oeis.FiniteSequence;

/**
 * A401470 a(n) is the number of n-digit numbers with distinct digits that are divisible by n.
 * @author Sean A. Irvine
 */
public class A401470 extends FiniteSequence {

  /** Construct the sequence. */
  public A401470() {
    super(1, FINITE, 9, 41, 228, 1120, 5712, 23664, 77720, 201600, 685440, 362880);
  }
}

