package irvine.oeis.a399;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a164.A164888;

/**
 * A399184 First differences of A164888.
 * @author Sean A. Irvine
 */
public class A399184 extends DifferenceSequence {

  /** Construct the sequence. */
  public A399184() {
    super(1, new A164888());
  }
}
