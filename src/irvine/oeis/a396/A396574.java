package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396574 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A396574 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final CR log = CR.valueOf(mN - 1).log();
    Z prod = Z.ONE;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      prod = prod.multiply(p.pow(log.divide(CR.valueOf(p).log()).floor()));
    }
    return prod.multiply(mN);
  }
}

