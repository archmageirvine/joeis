package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399670 Numbers with at least 6 divisors.
 * @author Sean A. Irvine
 */
public class A399670 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399670() {
    super(1, k -> Functions.SIGMA0.z(k).compareTo(Z.SIX) >= 0);
  }
}
