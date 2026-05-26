package irvine.oeis.a396;

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396226 a(n) = (n!)^7.
 * @author Sean A. Irvine
 */
public class A396226 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396226() {
    super(new A000142(), k -> k.pow(7));
  }
}

