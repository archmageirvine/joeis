package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001006;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398996 The binomial matrix of the Motzkin numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398996 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A001006();

  /** Construct the sequence. */
  public A398996() {
    super(0, SEQ::a);
  }
}
