package irvine.oeis.a398;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A398878 Triangular numbers t such that t+1, t+3, t+7, t+9 are four primes.
 * @author Sean
 */
public class A398878 extends FilterSequence {

  /** Construct the sequence. */
  public A398878() {
    super(1, new A000217(), t -> t.add(1).isProbablePrime() && t.add(3).isProbablePrime() && t.add(7).isProbablePrime() && t.add(9).isProbablePrime());
  }
}
