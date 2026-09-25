package irvine.oeis.a399;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399589 Product of the distinct entries in the central row and column of the (2*n + 1) X (2*n + 1) square array formed by the integers 1, 2, ..., (2*n + 1)^2 in order.
 * @author Sean A. Irvine
 */
public class A399589 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z c = Z.valueOf(2 * ++mN).add(2).multiply(mN).add(1);
    final Z c2 = c.square();
    final Z d2 = Z.valueOf(2 * mN + 1).square();
    return c.multiply(Integers.SINGLETON.product(1, mN, k -> c2.subtract(k * k).multiply(c2.subtract(d2.multiply(k * k)))));
  }
}
