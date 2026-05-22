package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a169.A169958;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396020 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A396020 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396020() {
    super(1, new A169958().skip(), Functions.SOPF::z);
  }
}
