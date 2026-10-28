package irvine.oeis.a401;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401207 Central-cross product divided by the central-cross sum in the (2*n + 1) X (2*n + 1) square array formed by the integers 1, 2, ..., (2*n + 1)^2 in order.
 * @author Sean A. Irvine
 */
public class A401207 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z c = Z.valueOf(2 * ++mN * mN + 2 * mN + 1);
    final Z c2 = c.square();
    final Z m2 = Z.valueOf(2 * mN + 1).square();
    return Integers.SINGLETON.product(1, mN, k -> c2.subtract(k * k).multiply(c2.subtract(m2.multiply(k * k)))).divide(4 * mN + 1);
  }
}

