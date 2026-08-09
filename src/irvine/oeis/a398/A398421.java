package irvine.oeis.a398;

import irvine.oeis.FilterSequence;
import irvine.oeis.a054.A054753;

/**
 * A398421 Odd numbers of the form p^2*q, where p and q are distinct odd primes.
 * @author Sean A. Irvine
 */
public class A398421 extends FilterSequence {

  /** Construct the sequence. */
  public A398421() {
    super(1, new A054753(), ODD);
  }
}
