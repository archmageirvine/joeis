package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005043;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399330 allocated for Peter Luschny.
 * @author Sean A. Irvine
 */
public class A399330 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.create(new A005043());

  /** Construct the sequence. */
  public A399330() {
    super(0, SEQ::a);
  }
}
