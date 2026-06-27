package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394611.
 * @author Sean A. Irvine
 */
public class A397221 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397221() {
    super(1, k -> Functions.RAD.l(k) * Functions.OMEGA.l(k) == k);
  }
}
