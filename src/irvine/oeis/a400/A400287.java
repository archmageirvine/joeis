package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400287 Numbers k such that k+1 divides phi(k)^2 + 1 where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A400287 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400287() {
    super(1, k -> Functions.PHI.z(k).square().add(1).mod(k + 1) == 0);
  }
}
