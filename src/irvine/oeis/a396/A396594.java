package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396594 Numbers m such that rad(m) * bigomega(m) = m.
 * @author Sean A. Irvine
 */
public class A396594 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396594() {
    super(1, k -> Functions.RAD.l(k) * Functions.BIG_OMEGA.l(k) == k);
  }
}
