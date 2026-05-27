package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396060 allocated for Michel Lagneau.
 * @author Sean A. Irvine
 */
public class A396060 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396060() {
    super(1, 2, 2, k -> Z.valueOf(k).square().add(1).isProbablePrime() && Z.valueOf(k).square().add(1 - k).isProbablePrime());
  }
}
