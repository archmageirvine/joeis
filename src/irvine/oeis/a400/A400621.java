package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019446;

/**
 * A400621 Row sums of a triangle where row n consists of the smallest n available positive integers, and each integer k is removed from the pool of available integers after appearing in k rows.
 * @author Sean A. Irvine
 */
public class A400621 extends A019446 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN).add(Functions.TRIANGULAR.z(mN - 1));
  }
}
