package irvine.oeis.a401;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401960 Primes of the form k*2^k + 7.
 * @author Sean A. Irvine
 */
public class A401960 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401960() {
    super(1, new A401992(), k -> k.shiftLeft(k.longValueExact()).add(7));
  }
}
