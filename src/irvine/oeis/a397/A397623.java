package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a005.A005652;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397623 a(n) = prime(A005652(n)).
 * @author Sean A. Irvine
 */
public class A397623 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397623() {
    super(1, new A005652(), Functions.PRIME::z);
  }
}
