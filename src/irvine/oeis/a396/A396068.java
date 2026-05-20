package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396068 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A396068 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.square().compareTo(mN) <= 0 && Predicates.SQUARE_FREE.is(d)) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}
