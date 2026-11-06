package irvine.oeis.a400;

import irvine.oeis.a023.A023201;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400433.
 * @author Sean A. Irvine
 */
public class A400380 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A400380() {
    super(1, new A023201(), p -> p.square().add(p.add(6).square()));
  }
}
