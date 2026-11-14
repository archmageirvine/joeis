package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401802 allocated for Robert Israel.
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
