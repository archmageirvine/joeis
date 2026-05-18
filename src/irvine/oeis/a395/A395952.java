package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395952 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A395952 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.ZERO;
    }
    Z k = Z.ONE.shiftLeft(mN - 1);
    while (true) {
      k = k.subtract(1);
      if (Functions.SIGMA0.l(k) == mN) {
        return k;
      }
      if (k.signum() <= 0) {
        return Z.ZERO; // should not happen
      }
    }
  }
}
