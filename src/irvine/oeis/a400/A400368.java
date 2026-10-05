package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399226 Numbers k such that sigma(k) = phi(k) + tau(k)^6.
 * @author Sean A. Irvine
 */
public class A400368 extends Sequence1 {

  private long mN = 1194648;

  private boolean is(final long n) {
    return !Predicates.SQUARE_FREE.is(n) && Functions.SIGMA1.z(n).equals(Functions.PHI.z(n).add(Functions.SIGMA0.z(n).pow(7)));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
