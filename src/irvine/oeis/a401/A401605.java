package irvine.oeis.a401;

import irvine.oeis.a070.A070043;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401605 Numbers of the form (6*y + 1) * (6*x + 1) for integers x&gt;0 and y&gt;0.
 * @author Sean A. Irvine
 */
public class A401605 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401605() {
    super(1, new A070043(), k -> k.multiply(6).add(1));
  }
}
