package irvine.oeis.a401;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401888 Number of n X n matrices M over GF(3) satisfying M^2 = 0.
 * @author Sean A. Irvine
 */
public class A401888 extends Sequence0 {

  private long mN = -1;

  private Z f(final long n, final long r, final long q) {
    final Z zq = Z.valueOf(q);
    return Integers.SINGLETON.product(0, r - 1, j -> zq.pow(n).subtract(zq.pow(j)))
      .divide(Integers.SINGLETON.product(0, r - 1, j -> zq.pow(r).subtract(zq.pow(j))));
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN / 2, r -> f(mN, r, 3)
      .multiply(Integers.SINGLETON.product(0, r - 1, j -> Z.THREE.pow(mN - r).subtract(Z.THREE.pow(j)))));
  }
}
