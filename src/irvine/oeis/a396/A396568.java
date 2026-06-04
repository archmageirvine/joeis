package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.oeis.a000.A000081;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396568 allocated for Chen Wei-Shi.
 * @author Sean A. Irvine
 */
public class A396568 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396568() {
    super(3, new A000081().skip(3), k -> Binomial.binomial(k, 2).multiply(4));
  }
}
