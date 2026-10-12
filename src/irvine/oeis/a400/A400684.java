package irvine.oeis.a400;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A400684 Primes p such that p+2 and (p-1)^2+1 are also prime.
 * @author Sean A. Irvine
 */
public class A400684 extends FilterSequence {

  /** Construct the sequence. */
  public A400684() {
    super(1, new A001359(), p -> p.subtract(1).square().add(1).isProbablePrime());
  }
}
