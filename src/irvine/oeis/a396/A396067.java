package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396067 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A396067 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.isOdd() && d.square().compareTo(mN) <= 0) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}
