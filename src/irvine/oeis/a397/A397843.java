package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397843 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A397843 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397843() {
    super(1, n -> Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.BIG_OMEGA.z(n).pow(4))));
  }
}
