package irvine.oeis.a395;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395912 allocated for William Verreault.
 * @author Sean A. Irvine
 */
public class A395912 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN + 1) / 2; k <= mN; ++k) {
      final long kk = k;
      final Z p1a = Integers.SINGLETON.product(1, k - 1, j -> Z.ONE.shiftLeft(mN).subtract(Z.ONE.shiftLeft(j)));
      final Z p1b = Integers.SINGLETON.product(1, k - 1, j -> Z.ONE.shiftLeft(kk).subtract(Z.ONE.shiftLeft(j)));
      final Z p2 = Integers.SINGLETON.product(0, mN - k - 1, j -> Z.ONE.shiftLeft(kk).subtract(Z.ONE.shiftLeft(j)));
      sum = sum.add(p1a.divide(p1b).multiply(p2).shiftLeft(k));
    }
    return sum;
  }
}

