package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400777 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A400777 extends Sequence1 {

  private long mN = 138865817224L;

  private boolean is(final long n) {
    return !Predicates.SQUARE_FREE.is(n) && Functions.SIGMA1.z(n).equals(Functions.PHI.z(n).add(Functions.SIGMA0.z(n).pow(10)));
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
