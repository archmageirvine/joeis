package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400487 allocated for Omar Said.
 * @author Sean A. Irvine
 */
public class A400487 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private boolean is(final long m) {
    Z x = Z.valueOf(m);
    Z y = Z.valueOf(m + 1);
    Z z = Z.valueOf(m - 1);
    while (true) {
      if (x.isOne()) {
        return y.isOne() || z.isOne();
      }
      if (y.isOne()) {
        y = Z.ZERO;
      }
      if (z.isOne()) {
        z = Z.ZERO;
      }
      if (y.isZero() && z.isZero()) {
        return false;
      }
      x = Functions.COLLATZ.z(x);
      y = Functions.COLLATZ.z(y);
      z = Functions.COLLATZ.z(z);
    }
  }

  @Override
  public Z next() {
    ++mN;
    for (long m = 1L << (mN - 1); m < 1L << mN; ++m) {
      if (is(m)) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
