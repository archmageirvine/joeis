package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A398791 Numbers k such that k!! + k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A398791 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398791() {
    super(1, 0, k -> Functions.MULTIFACTORIAL.z(k).add(k + 1).isProbablePrime());
  }
}
