package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399537 allocated for John Watkinson.
 * @author Sean A. Irvine
 */
public class A399537 extends Sequence1 {

  // After John Watkinson

  private int mN = 0;
  private Z mA = Z.ONE;

  private static Z t(int n, int m) {
    final int t = m * n - m - n;
    if (t < 0) {
      return Z.ZERO;
    }
    final Z[] d = new Z[t + 1];
    Arrays.fill(d, Z.ZERO);
    d[0] = Z.ONE;
    for (int j = m + 1; j < n; ++j) {
      for (int s = t; s >= j; --s) {
        d[s] = d[s].add(d[s - j]);
      }
    }
    return d[t];
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      for (int m = 2; m < mN; ++m) {
        mA = mA.add(t(mN, m));
      }
    }
    return mA;
  }
}

