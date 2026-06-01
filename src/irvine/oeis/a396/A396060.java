package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396060 Numbers m such that m^2 + 1 and m^2 - m + 1 are both prime numbers.
 * @author Sean A. Irvine
 */
public class A396060 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396060() {
    super(1, 2, 2, k -> Z.valueOf(k).square().add(1).isProbablePrime() && Z.valueOf(k).square().add(1 - k).isProbablePrime());
  }
}
