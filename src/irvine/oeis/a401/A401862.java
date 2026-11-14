package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.a(n) is the number of k with 1 <= k <= n/2 such that the product of digits of n is the sum of the product of digits of k and the product of digits of n-k.
 * @author Sean A. Irvine
 */
public class A401862 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z prod = Functions.DIGIT_PRODUCT.z(++mN);
    long cnt = 0;
    for (long k = 1; 2 * k <= mN; ++k) {
      if (prod.equals(Functions.DIGIT_PRODUCT.z(k).add(Functions.DIGIT_PRODUCT.z(mN - k)))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
