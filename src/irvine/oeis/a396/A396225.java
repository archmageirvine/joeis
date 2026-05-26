package irvine.oeis.a396;

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396225 a(n) = (n!)^6.
 * @author Sean A. Irvine
 */
public class A396225 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396225() {
    super(new A000142(), k -> k.pow(6));
  }
}

