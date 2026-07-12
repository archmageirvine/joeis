package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397703 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + omega(k)^4.
 * @author Sean A. Irvine
 */
public class A397703 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397703() {
    super(1, 964596, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).pow(4)).add(Functions.OMEGA.z(k).pow(4))));
  }
}
