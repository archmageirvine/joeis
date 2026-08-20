package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396252 Conductor of the elliptic curve y^2 = x^3 + 3*n*x + (1 - n^3), the Kraus-Frey curve for x^3 + y^3 = z^k, at (x,y) = (n,1).
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
