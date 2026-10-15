package irvine.oeis.a400;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400894 Bipartition of the positive odd numbers depending on the parity of the 2-adic valuation A007814(3*k + 2). Here the part with even valuation based on A400891.
 * @author Sean A. Irvine
 */
public class A400894 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A400894() {
    super(1, new A400891(), k -> k.multiply2().add(1));
  }
}
