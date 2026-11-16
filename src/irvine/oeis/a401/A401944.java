package irvine.oeis.a401;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003586;

/**
 * A401944 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A401944 extends FilterSequence {

  /** Construct the sequence. */
  public A401944() {
    super(1, new A003586(), k -> k.multiply(3).subtract(3).multiply(k).add(1).isProbablePrime());
  }
}
