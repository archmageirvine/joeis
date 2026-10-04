package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.a036.A036537;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400522 The exponent of the highest power of 2 dividing the n-th number whose number of divisors is a power of 2 (A036537).
 * @author Sean A. Irvine
 */
public class A400522 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A400522() {
    super(1, new A036537(), k -> Functions.VALUATION.z(k, 2));
  }
}
