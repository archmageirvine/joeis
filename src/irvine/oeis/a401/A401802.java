package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401802 a(n) is the least k, 1 &lt;= k &lt; n, such that the product of digits of n is the sum of the product of digits of k and the product of digits of n-k, or -1 if there is no such k.
 * @author Sean A. Irvine
 */
public class A401802 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z prod = Functions.DIGIT_PRODUCT.z(++mN);
    for (long k = 1; k < mN; ++k) {
      if (prod.equals(Functions.DIGIT_PRODUCT.z(k).add(Functions.DIGIT_PRODUCT.z(mN - k)))) {
        return Z.valueOf(k);
      }
    }
    return Z.NEG_ONE;
  }
}
