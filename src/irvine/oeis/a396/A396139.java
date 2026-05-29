package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396139 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A396139 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    if (Predicates.PRIME.is(mN)) {
      return Z.THREE.pow(mN - 1);
    }
    Z k = Z.ONE.shiftLeft(mN - 1);
    while (true) {
      k = k.add(1);
      if (Functions.SIGMA0.l(k) == mN) {
        return k;
      }
    }
  }
}

