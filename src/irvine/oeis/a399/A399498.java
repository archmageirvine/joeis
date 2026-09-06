package irvine.oeis.a399;

import irvine.oeis.a033.A033323;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399498 allocated for Carlo Corti.
 * @author Sean A. Irvine
 */
public class A399498 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399498() {
    super(1, new A033323(), k -> k.divide(8));
  }
}

