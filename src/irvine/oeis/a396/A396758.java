package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395642.
 * @author Sean A. Irvine
 */
public class A396758 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396758() {
    super(1, new A396234(), Z.SIX::add);
  }
}
