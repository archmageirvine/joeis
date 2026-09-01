package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000111;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399332 The binomial matrix of the Euler up/down numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399332 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.create(new A000111());

  /** Construct the sequence. */
  public A399332() {
    super(0, SEQ::a);
  }
}
