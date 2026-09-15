package irvine.oeis.a399;

import irvine.oeis.InverseSequence;

/**
 * A399763 allocated for Eric Fox.
 * @author Sean A. Irvine
 */
public class A399763 extends InverseSequence {

  /** Construct the sequence. */
  public A399763() {
    super(0, 0, new A399633());
  }
}
