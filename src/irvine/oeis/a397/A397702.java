package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397702 Numbers k such that sigma(k) = psi(k) + tau(k)^5 + omega(k)^5.
 * @author Sean A. Irvine
 */
public class A397702 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397702() {
    super(1, 1405957, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).pow(5)).add(Functions.OMEGA.z(k).pow(5))));
  }
}
