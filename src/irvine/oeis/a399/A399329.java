package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003418;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399329 The binomial matrix of the LCM of {1, 2, ..., n}. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399329 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A003418();

  /** Construct the sequence. */
  public A399329() {
    super(0, SEQ::a);
  }
}
