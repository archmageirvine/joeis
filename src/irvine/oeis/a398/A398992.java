package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000984;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398992 The binomial matrix of the central binomial numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398992 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A000984();

  /** Construct the sequence. */
  public A398992() {
    super(0, SEQ::a);
  }
}
