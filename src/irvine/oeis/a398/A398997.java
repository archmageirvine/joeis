package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398997 The binomial matrix of the number of involutions (A000085). Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398997 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A000085();

  /** Construct the sequence. */
  public A398997() {
    super(0, SEQ::a);
  }
}
