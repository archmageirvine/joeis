package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399124 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399124 extends Sequence1 {

  private int mN = 0;

  private Z f(final long n, final long s, final long r) {
    Z prod = Functions.FACTORIAL.z(n);
    for (long j = 0; j < r; ++j) {
      prod = prod.multiply(Functions.FACTORIAL.z(j));
    }
    for (long j = 0; j < r; ++j) {
      prod = prod.divide(Functions.FACTORIAL.z(s + j));
    }
    return prod;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long r = 1; r <= mN; ++r) {
      if (mN % r  == 0) {
        sum = sum.add(f(mN, r, mN / r).square());
      }
    }
    return sum;
  }
}
