package irvine.oeis.a401;

import irvine.oeis.InverseSequence;

/**
 * A401737 Least k such that A401736(k) = n.
 * @author Sean A. Irvine
 */
public class A401737 extends InverseSequence {

  /** Construct the sequence. */
  public A401737() {
    super(0, 0, new A401736(), 0);
  }
}
