package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396599 Odd numbers k where sigma_2(k)/k is an integer.
 * @author Sean A. Irvine
 */
public class A396599 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396599() {
    super(1, 1, 2, k -> Functions.SIGMA.z(2, k).mod(k) == 0);
  }
}
