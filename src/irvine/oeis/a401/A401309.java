package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401309 allocated for M. Jeremie Lafitte (Levitas).
 * @author Sean A. Irvine
 */
public class A401309 extends Sequence0 {

  private long mN = -1;

  private static int b(final long n, final long j) {
    if (n == 0) {
      return 1;
    }
    final int t = (int) ((n / 2 % 3 + j / 2 % 3 + n % 2 + j % 2) % 3);
    return (b(n / 2, j / 2) + (t != 0 ? 1 : 0)) & 1;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long h = Long.highestOneBit(mN);
    long j = mN;
    Z v = Z.ZERO;
    Z p = Z.ONE;
    while (j >= h) {
      if (b(mN, j) != 0) {
        v = v.add(p);
      }
      p = p.multiply2();
      j = (j - 1) & mN;
    }
    return v;
  }
}
