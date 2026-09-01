package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a056.A056040;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399335 The binomial matrix of the swinging factorial (A056040). Square array read by ascending antidiagonals.
 * @author Sean A. Irvine
 */
public class A399335 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A056040();

  /** Construct the sequence. */
  public A399335() {
    super(0, SEQ::a);
  }
}
