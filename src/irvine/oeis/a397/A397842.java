package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397842 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A397842 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397842() {
    super(1, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.OMEGA.z(k).pow(7))));
  }
}
