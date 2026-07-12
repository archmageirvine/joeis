package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397701 Numbers k such that sigma(k) = psi(k) + tau(k)^3 + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A397701 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397701() {
    super(1, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).pow(3)).add(Functions.OMEGA.z(k).pow(3))));
  }
}
