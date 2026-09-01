package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001850;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399337 The binomial matrix of the central Delannoy numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399337 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A001850();

  /** Construct the sequence. */
  public A399337() {
    super(0, SEQ::a);
  }
}
