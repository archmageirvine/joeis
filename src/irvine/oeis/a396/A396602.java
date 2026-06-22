package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396602 Odd numbers k where sigma_5(k)/k is an integer.
 * @author Sean A. Irvine
 */
public class A396602 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396602() {
    super(1, 1, 2, k -> Functions.SIGMA.z(5, k).mod(k) == 0);
  }
}
