package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399333 The binomial matrix of the noncomposite numbers (A008578). Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399333 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.forceCreate(0, new A008578());

  /** Construct the sequence. */
  public A399333() {
    super(0, SEQ::a);
  }
}
