package irvine.oeis.a397;

import irvine.oeis.FixedPointPositionSequence;
import irvine.oeis.a093.A093811;

/**
 * A397257 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A397257 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A397257() {
    super(1, new A093811());
  }
}
