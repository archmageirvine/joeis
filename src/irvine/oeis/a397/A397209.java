package irvine.oeis.a397;

import irvine.oeis.InverseSequence;

/**
 * A397209 a(n) is the smallest index k such that A397208(k) = n.
 * @author Sean A. Irvine
 */
public class A397209 extends InverseSequence {

  /** Construct the sequence. */
  public A397209() {
    super(0, 0, new A397208());
  }
}
