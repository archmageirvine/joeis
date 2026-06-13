package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396600 Odd numbers k where sigma_3(k)/k is an integer.
 * @author Sean A. Irvine
 */
public class A396600 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396600() {
    super(1, 1, 2, k -> Functions.SIGMA.z(3, k).mod(k) == 0);
  }
}
