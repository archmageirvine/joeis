package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400133 allocated for Jonas Karlsson.
 * @author Sean A. Irvine
 */
public class A400133 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A400133() {
    super(1, new A400184(), Z::divide2);
  }
}

