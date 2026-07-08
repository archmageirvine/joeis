package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397024 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A397024 extends Sequence0 {

  private long mN = -1;
  private Z mSum = null;

  private void process(final long n, final long m, final int pos) {
    if (1L << pos > n) {
      mSum = mSum.add(Functions.GCD.l(n, m));
      return;
    }
    process(n, m, pos + 1);
    if ((n & (1L << pos)) != 0) {
      process(n, m & ~(1L << pos), pos + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSum = Z.ZERO;
    process(mN, mN, 0);
    return mSum;
  }
}
