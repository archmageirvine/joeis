package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400486 Number of positive integers m &lt; 2^n - 1 such that the Collatz trajectories of m and m+1 meet within n steps, after equal numbers of halving steps and before either reaches 1.
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
