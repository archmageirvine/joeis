package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.oeis.a000.A000081;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396539 allocated for Chen Wei-Shi.
 * @author Sean A. Irvine
 */
public class A396539 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396539() {
    super(4, new A000081().skip(4), k -> Binomial.binomial(k, 4).multiply(3));
  }
}
