package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397464 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397464 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397464() {
    super(1, new A397428(), Functions.PRIME::z);
  }
}
