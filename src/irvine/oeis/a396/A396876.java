package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396876 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A396876 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396876() {
    super(1, k -> Functions.CORE.z(k).equals(Functions.BIG_OMEGA.z(k).subtract(Functions.OMEGA.l(k))));
  }
}
