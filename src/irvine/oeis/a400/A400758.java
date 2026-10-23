package irvine.oeis.a400;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005217;

/**
 * A400758 allocated for Yoav Binyamin.
 * @author Sean A. Irvine
 */
public class A400758 extends PartialSumSequence {

  /** Construct the sequence. */
  public A400758() {
    super(0, new A005217());
  }
}
