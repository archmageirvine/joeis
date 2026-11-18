package irvine.oeis.a401;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401943 Primes of the form 3*k^2 - 3*k + 1 where k &gt; 1 is a 3-smooth number.
 * @author Sean A. Irvine
 */
public class A401943 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401943() {
    super(1, new A401944(), k -> k.multiply(3).subtract(3).multiply(k).add(1));
  }
}
