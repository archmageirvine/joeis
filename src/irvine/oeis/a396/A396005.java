package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396005 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A396005 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396005() {
    super(1, k -> Functions.SIGMA0.z(2 * k).equals(Functions.SIGMA0.z(k + 2)));
  }
}
