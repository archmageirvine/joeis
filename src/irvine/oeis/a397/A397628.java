package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a026.A026352;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397628 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397628 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397628() {
    super(1, new A026352(), Functions.PRIME::z);
  }
}
