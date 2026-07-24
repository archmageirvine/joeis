package irvine.oeis.a397;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a061.A061017;

/**
 * A397890 Minimum binary length of a standard-order composition with n distinct runs; bit length of A351015(n).
 * @author Sean A. Irvine
 */
public class A397890 extends PartialSumSequence {

  /** Construct the sequence. */
  public A397890() {
    super(0, new A061017().prepend(0));
  }
}
