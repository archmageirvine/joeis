package irvine.oeis.a400;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000290;

/**
 * A400197 allocated for Geoffrey Caveney.
 * @author Sean A. Irvine
 */
public class A400197 extends PrependSequence {

  /** Construct the sequence. */
  public A400197() {
    super(0, new A000290().skip(2), 0, 1, 2);
  }
}
