package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396763 allocated for Hoang Nguyen.
 * @author Sean A. Irvine
 */
public class A396763 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396763() {
    super(1, 2, k -> {
      final Z s1 = Functions.SIGMA1.z(k);
      final long s0 = Functions.SIGMA0.l(k);
      return s1.mod(s0) == 0 && s1.subtract(k).mod(s0 - 1) == 0;
    });
  }
}

