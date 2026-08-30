package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005043;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399000 The binomial matrix of the Catalan numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399330 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.create(new A005043());

  /** Construct the sequence. */
  public A399330() {
    super(0, SEQ::a);
  }
}
