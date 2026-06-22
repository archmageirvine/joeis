package irvine.oeis.a396;

import irvine.oeis.InverseSequence;

/**
 * A396950 a(n) is the smallest integer m such that A396377(m) = n.
 * @author Sean A. Irvine
 */
public class A396950 extends InverseSequence {

  /** Construct the sequence. */
  public A396950() {
    super(1, new A396377());
  }
}
