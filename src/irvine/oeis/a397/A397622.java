package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a005.A005653;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397622 a(n) = prime(A005653(n)).
 * @author Sean A. Irvine
 */
public class A397622 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397622() {
    super(1, new A005653(), Functions.PRIME::z);
  }
}
