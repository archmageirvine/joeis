package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399339 The binomial matrix of the Polya tree numbers, square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399339 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.create(new A000081().skip().prepend(1));

  /** Construct the sequence. */
  public A399339() {
    super(0, SEQ::a);
  }
}
