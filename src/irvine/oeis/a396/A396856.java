package irvine.oeis.a396;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001597;

/**
 * A396856 Union of primes and perfect powers.
 * @author Sean A. Irvine
 */
public class A396856 extends UnionSequence {

  /** Construct the sequence. */
  public A396856() {
    super(1, new A000040(), new A001597());
  }
}

