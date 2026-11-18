package irvine.oeis.a401;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003586;

/**
 * A401944 3-smooth numbers k &gt; 1 such that 3*k^2 - 3*k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A401944 extends FilterSequence {

  /** Construct the sequence. */
  public A401944() {
    super(1, new A003586(), k -> k.multiply(3).subtract(3).multiply(k).add(1).isProbablePrime());
  }
}
