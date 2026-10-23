package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401147 Numbers k such that k^4 - 1 is the product of exactly 4 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A401147 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401147() {
    super(1, 10, 2, k -> Functions.BIG_OMEGA.l(Z.valueOf(k).pow(4).subtract(1)) == 4);
  }
}
