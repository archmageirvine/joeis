package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400287 allocated for Sajid Khan Hussain.
 * @author Sean A. Irvine
 */
public class A400287 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400287() {
    super(1, k -> Functions.PHI.z(k).square().add(1).mod(k + 1) == 0);
  }
}
