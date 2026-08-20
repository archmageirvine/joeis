package irvine.oeis.a398;

import irvine.oeis.FilterSequence;

/**
 * A398569 Odd numbers of the form p^2*s, where p is prime, s is squarefree, gcd(p,s) = 1, and A001221(s) &gt;= 2.
 * @author Sean A. Irvine
 */
public class A398569 extends FilterSequence {

  /** Construct the sequence. */
  public A398569() {
    super(1, new A398316(), ODD);
  }
}
