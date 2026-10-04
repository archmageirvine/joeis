package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A400486 extends Sequence1 {

  private int mN = 0;

  private boolean is(final long m, final int n) {
    Z x = Z.valueOf(m);
    Z y = Z.valueOf(m + 1);
    long h = 0;
    for (int j = 0; j <= n; ++j) {
      if (x.isOne() || y.isOne()) {
        return false;
      }
      if (x.equals(y)) {
        return h == 0;
      }
      if (x.isEven()) {
        ++h;
      }
      if (y.isEven()) {
        --h;
      }
      x = Functions.COLLATZ.z(x);
      y = Functions.COLLATZ.z(y);
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long m = 0; m < 1L << mN; ++m) {
      if (is(m, mN)) {
        ++sum;
      }
    }
    return Z.valueOf(sum);
  }
}
