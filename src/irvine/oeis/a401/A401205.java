package irvine.oeis.a401;

import irvine.oeis.InverseSequence;

/**
 * A401205 Least k such that A401018(k) = n.
 * @author Sean A. Irvine
 */
public class A401205 extends InverseSequence {

  /** Construct the sequence. */
  public A401205() {
    super(0, 0, new A401018());
  }
}

