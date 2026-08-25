package irvine.oeis.a398;

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000262;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A398989 allocated for Peter Luschny.
 * @author Sean A. Irvine
 */
public class A398989 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = DirectSequence.create(new A000262());

  /** Construct the sequence. */
  public A398989() {
    super(0, SEQ::a);
  }
}
