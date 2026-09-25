package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399898 Partial sums missed by the grasshopper infinite barrycade (recursively defined family of permutations of the positive integers having pairwise disjoint sets of partial sums).
 * @author Sean A. Irvine
 */
public class A399898 extends A399897 {

  private long mN = 0;

  private boolean is(final long n) {
    int row = -1;
    while (t(++row, 1) <= n) {
      int col = 0;
      long s = 0;
      while (s < n) {
        s += t(row, ++col);
      }
      if (s == n) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
