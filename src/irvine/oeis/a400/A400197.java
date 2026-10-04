package irvine.oeis.a400;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000290;

/**
 * A400197 The union of the squares (A000290) and the integer 2.
 * @author Sean A. Irvine
 */
public class A400197 extends PrependSequence {

  /** Construct the sequence. */
  public A400197() {
    super(0, new A000290().skip(2), 0, 1, 2);
  }
}
