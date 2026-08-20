package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397921 allocated for Leo Hennig.
 * @author Sean A. Irvine
 */
public class A397921 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397921() {
    super(1, k -> Functions.SIGMA1.z(k).multiply(Functions.SIGMA0.z(k)).add(1).mod(k) == 0);
  }
}

