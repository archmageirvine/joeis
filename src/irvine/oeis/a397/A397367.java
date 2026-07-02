package irvine.oeis.a397;

import irvine.oeis.DirectSequence;
import irvine.oeis.a246.A246655;

/**
 * A397367 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397367 extends A397126 {

  /** Construct the sequence. */
  public A397367() {
    super(DirectSequence.forceCreate(1, new A246655()));
  }
}
