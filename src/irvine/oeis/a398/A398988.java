package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000312;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398988 allocated for Peter Luschny.
 * @author Sean A. Irvine
 */
public class A398988 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A000312();

  /** Construct the sequence. */
  public A398988() {
    super(0, SEQ::a);
  }
}
