package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001045;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399000 The binomial matrix of the Catalan numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399336 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A001045();

  /** Construct the sequence. */
  public A399336() {
    super(0, SEQ::a);
  }
}
