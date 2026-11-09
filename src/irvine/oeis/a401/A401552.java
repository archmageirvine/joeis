package irvine.oeis.a401;

import irvine.oeis.a400.A400000;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A401552 Run lengths of A400000.
 * @author Sean A. Irvine
 */
public class A401552 extends RunLengthTransform {

  /** Construct the sequence. */
  public A401552() {
    super(1, new A400000());
  }
}
