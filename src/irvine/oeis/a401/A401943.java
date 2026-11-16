package irvine.oeis.a401;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401943 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A401943 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401943() {
    super(1, new A401944(), k -> k.multiply(3).subtract(3).multiply(k).add(1));
  }
}
