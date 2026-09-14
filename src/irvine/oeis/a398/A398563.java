package irvine.oeis.a398;

import irvine.oeis.FilterSequence;
import irvine.oeis.a086.A086120;

/**
 * A398563 Semiprimes of the form p^3 - q^3 where p and q are primes.
 * @author Sean A. Irvine
 */
public class A398563 extends FilterSequence {

  /** Construct the sequence. */
  public A398563() {
    super(1, new A086120(), SEMIPRIME);
  }
}
