package irvine.oeis.a396;

import irvine.oeis.a253.A253880;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396641 Centered hexagonal numbers h such that 7*h is also a centered hexagonal number.
 * @author Sean A. Irvine
 */
public class A396641 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396641() {
    super(1, new A253880(), k -> k.multiply(6).add(1).divide(7));
  }
}
