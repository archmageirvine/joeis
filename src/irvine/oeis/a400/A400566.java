package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400566 Nonsquarefree numbers k such that sigma(k) = phi(k) + tau(k)^9.
 * @author Sean A. Irvine
 */
public class A400566 extends Sequence1 {

  private long mN = 1541054397763L;

  private boolean is(final long n) {
    return !Predicates.SQUARE_FREE.is(n) && Functions.SIGMA1.z(n).equals(Functions.PHI.z(n).add(Functions.SIGMA0.z(n).pow(9)));
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
