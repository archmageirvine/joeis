package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a001.A001093;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396945 Number of divisors of n^3 + 1.
 * @author Sean A. Irvine
 */
public class A396945 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396945() {
    super(0, new A001093().skip(), Functions.SIGMA0::z);
  }
}
