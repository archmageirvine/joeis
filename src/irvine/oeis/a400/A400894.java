package irvine.oeis.a400;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400894 allocated for Wolfdieter Lang.
 * @author Sean A. Irvine
 */
public class A400894 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A400894() {
    super(1, new A400891(), k -> k.multiply2().add(1));
  }
}
