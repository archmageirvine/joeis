package irvine.oeis.a400;

import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005385;
import irvine.oeis.a063.A063640;

/**
 * A400948 Primes p such that (p-1)/2 is either prime or a squarefree semiprime.
 * @author Sean A. Irvine
 */
public class A400948 extends UnionSequence {

  /** Construct the sequence. */
  public A400948() {
    super(1, new A005385(), new A063640().skip(2).prepend(13));
  }
}
