package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397841 Numbers k such that sigma(k) = psi(k) + tau(k)^6 + omega(k)^6.
 * @author Sean A. Irvine
 */
public class A397841 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397841() {
    super(1, 1769877, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).pow(6)).add(Functions.OMEGA.z(k).pow(6))));
  }
}
