package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396949 allocated for Hinako Tsutsumi.
 * @author Sean A. Irvine
 */
public class A396949 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396949() {
    super(1, k -> Functions.OMEGA.l(k) + Functions.BIG_OMEGA.l(k) == Functions.SOPF.l(k));
  }
}
