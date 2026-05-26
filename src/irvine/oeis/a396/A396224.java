package irvine.oeis.a396;

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396224 a(n) = (n!)^5.
 * @author Sean A. Irvine
 */
public class A396224 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396224() {
    super(new A000142(), k -> k.pow(5));
  }
}

