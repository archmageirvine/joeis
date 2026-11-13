package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a060.A060687;

/**
 * A400465 Numbers k not divisible by lpf(k)^2 such that bigomega(k) = omega(k) + 1, where bigomega = A001222, omega = A001221, and lpf(k) is the smallest prime factor of k.
 * @author Sean A. Irvine
 */
public class A400465 extends FilterSequence {

  /** Construct the sequence. */
  public A400465() {
    super(1, new A060687(), k -> !k.mod(Functions.LPF.z(k).square()).isZero());
  }
}
