package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396601 allocated for Alexander Violette.
 * @author Sean A. Irvine
 */
public class A396601 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396601() {
    super(1, 1, 2, k -> Functions.SIGMA.z(4, k).mod(k) == 0);
  }
}
