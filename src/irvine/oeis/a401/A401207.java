package irvine.oeis.a401;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401207 allocated for Marco Rip\u00e0.
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

