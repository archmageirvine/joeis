package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a169.A169959;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396021 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A396021 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396021() {
    super(1, new A169959().skip(), Functions.SOPF::z);
  }
}
