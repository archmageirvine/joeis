package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398769 Odd numbers k such that k is a multiple of (product of digits of k) * (sum of digits of k).
 * @author Sean A. Irvine
 */
public class A398769 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long prod = Functions.DIGIT_PRODUCT.l(mN);
      if (prod != 0 && mN % (prod * Functions.DIGIT_SUM.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

