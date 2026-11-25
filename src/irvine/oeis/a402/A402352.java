package irvine.oeis.a402;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a002.A002182;
import irvine.oeis.a332.A332785;

/**
 * A402352 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A402352 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A402352() {
    super(new A332785(), new A002182());
  }
}
