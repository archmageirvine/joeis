package irvine.oeis.a398;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a054.A054753;
import irvine.oeis.a072.A072357;

/**
 * A398316 Numbers of the form p^2*s, where p is prime, s is squarefree, gcd(p,s) = 1, and A001221(s) &gt;= 2.
 * @author Sean A. Irvine
 */
public class A398316 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A398316() {
    super(1, new A072357(), new A054753());
  }
}
