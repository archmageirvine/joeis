package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401766 The least starting number that first reaches 2 after exactly n iterations of the decimal digit-product map.
 * @author Sean A. Irvine
 */
public class A401766 extends Sequence0 {

  private int mN = -1;

  private boolean is(final long k) {
    Z t = Z.valueOf(k);
    for (int j = 0; j < mN; ++j) {
      if (t.compareTo(Z.TWO) <= 0) {
        return false;
      }
      t = Functions.DIGIT_PRODUCT.z(t);
    }
    return Z.TWO.equals(t);
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

