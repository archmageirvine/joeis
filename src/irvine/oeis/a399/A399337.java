package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001850;
import irvine.oeis.transform.BinomialMatrixTransform;

/**
 * A399337 allocated for Peter Luschny.
 * @author Sean A. Irvine
 */
public class A399337 extends BinomialMatrixTransform {

  private static final DirectSequence SEQ = new A001850();

  /** Construct the sequence. */
  public A399337() {
    super(0, SEQ::a);
  }
}
