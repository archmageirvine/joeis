package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006318;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398994 The binomial matrix of the Schr\u00f6der numbers A006318. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398994 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A006318();

  /** Construct the sequence. */
  public A398994() {
    super(0, SEQ::a);
  }
}
