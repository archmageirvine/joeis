package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A398814 Numbers k such that k!! + k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A398814 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398814() {
    super(1, n -> Functions.MULTIFACTORIAL.z(n).add(n - 1).isProbablePrime());
  }
}
