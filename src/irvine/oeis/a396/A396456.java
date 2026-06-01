package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a055.A055932;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396456 Smallest prime greater than the n-th prime-complete number.
 * @author Sean A. Irvine
 */
public class A396456 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396456() {
    super(1, new A055932().skip(), Functions.NEXT_PRIME::z);
  }
}

