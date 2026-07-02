package irvine.oeis.a397;

import irvine.oeis.DirectSequence;
import irvine.oeis.a246.A246547;

/**
 * A397368 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397368 extends A397126 {

  /** Construct the sequence. */
  public A397368() {
    super(DirectSequence.forceCreate(1, new A246547()));
  }
}
