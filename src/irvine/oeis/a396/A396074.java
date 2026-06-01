package irvine.oeis.a396;

import irvine.oeis.FiniteSequence;

/**
 * A396074 a(n) is the smallest number P such that there exists a partition of P with K parts that has exactly n parts p, with the property that each p appears in exactly P*K/100 parts.
 * @author Sean A. Irvine
 */
public class A396074 extends FiniteSequence {

  /** Construct the sequence. */
  public A396074() {
    super(1, FINITE, 19, 42, 72, 100, 145, 211, 268, 340, 430, 540, 672, 828, 945);
  }
}
