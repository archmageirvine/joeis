package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400544 Number of S_3-symmetric unrestricted 3-dimensional vector partitions of (n, n, n).
 * @author Sean A. Irvine
 */
public class A400544 extends Sequence0 {

  private int mN = -1;

  private static int c(final int w) {
    int ans = 2 + w / 2;
    if (w % 3 == 0) {
      --ans;
    }
    if (w % 2 == 0) {
      ans += (w * w + 24) / 48;
    }
    return ans;
  }

  @Override
  public Z next() {
    ++mN;
    final Z[] a = new Z[mN + 1];
    for (int i = 0; i <= mN; ++i) {
      a[i] = Z.ZERO;
    }
    a[0] = Z.ONE;
    for (int w = 1; w <= mN; ++w) {
      final int cw = c(w);
      for (int j = 0; j < cw; ++j) {
        for (int i = w; i <= mN; ++i) {
          a[i] = a[i].add(a[i - w]);
        }
      }
    }
    return a[mN];
  }
}
