package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a394.A394720;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396176 a(n) = primepi(A394720(n)).
 * @author Sean A. Irvine
 */
public class A396176 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396176() {
    super(new A394720(), Functions.PRIME_PI::z);
  }
}

