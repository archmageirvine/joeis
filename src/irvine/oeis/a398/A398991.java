package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000670;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398991 The binomial matrix of the Fubini numbers. Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A398991 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A000670();

  /** Construct the sequence. */
  public A398991() {
    super(0, SEQ::a);
  }
}
