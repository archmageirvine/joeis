package irvine.oeis.a397;

import irvine.oeis.FiniteSequence;

/**
 * A397689 Irregular triangle read by rows: let p be the least prime such that k*(k + 1)*(k + 2)/3 + p produces primes for k=0..n-1 and a composite for k=n, the n-th row gives the list of primes for k=0..n-1.
 * @author Sean A. Irvine
 */
public class A397689 extends FiniteSequence {

  /** Construct the sequence. */
  public A397689() {
    super(1, FINITE, 2, 17, 19, 5, 7, 13, 11, 13, 19, 31, 3, 5, 11, 23, 43, 73);
  }
}
