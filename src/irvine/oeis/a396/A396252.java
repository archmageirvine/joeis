package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396252 allocated for Ege \u00d6zt\u00fcrk.
 * @author Sean A. Irvine
 */
public class A396252 extends Sequence1 {

  private static final long[] C = {2, 5, 3, 4};
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.NINE.shiftLeft(C[(int) (mN & 3)]);
    for (final Z p : Jaguar.factor(Z.valueOf(mN).pow(3).add(1)).toZArray()) {
      if (p.compareTo(Z.FIVE) >= 0) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
