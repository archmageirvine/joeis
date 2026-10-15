package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400869 The number of ordered pairs (k_1, k_2) of nonnegative integers bitwise covered by n such that k_1 + k_2 is also bitwise covered by n.
 * @author Sean A. Irvine
 */
public class A400869 extends Sequence0 {

  private int mN = -1;

  private long t(final long n, final long k) {
    return (n & k) == k ? 1 : 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      for (int j = 0; j <= mN; ++j) {
        sum = sum.add(t(mN, k) * t(mN, j) * t(mN, k + j));
      }
    }
    return sum;
  }
}

