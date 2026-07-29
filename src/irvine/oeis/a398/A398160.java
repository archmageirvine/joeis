package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A398160 Numbers k such that sigma(k) = psi(k) + Omega(k)^6.
 * @author Sean A. Irvine
 */
public class A398160 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398160() {
    super(1, n -> Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.BIG_OMEGA.z(n).pow(6))));
  }
}
