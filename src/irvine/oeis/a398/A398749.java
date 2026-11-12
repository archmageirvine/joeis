package irvine.oeis.a398;

import irvine.oeis.a060.A060355;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398749 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A398749 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A398749() {
    super(1, new A060355(), k -> k.multiply(k.add(1)));
  }
}
