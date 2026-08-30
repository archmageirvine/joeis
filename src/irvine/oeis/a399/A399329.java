package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003418;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399000 The binomial matrix of the Catalan numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399329 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A003418();

  /** Construct the sequence. */
  public A399329() {
    super(0, SEQ::a);
  }
}
