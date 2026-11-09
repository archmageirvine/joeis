package irvine.oeis.a400;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400966 Minimum number of exposed cubic faces of a 4-dimensional polyhypercube formed by n unit tesseracts.
 * @author Sean A. Irvine
 */
public class A400966 extends Sequence1 {

  // After Eddie Lin Rui

  private long mN = 0;

  private Z s(final long d, final long k) {
    if (k == 0) {
      return Z.ZERO;
    }
    if (d == 1) {
      return Z.TWO;
    }
    long m = 1;
    while (LongUtils.pow(m + 1, d) <= k) {
      ++m;
    }
    final ArrayList<Long> b = new ArrayList<>();
    Z bigB = Z.ONE;
    for (int i = 1; i <= d; ++i) {
      final long v = m + (k >= LongUtils.pow(m, d - i) * LongUtils.pow(m + 1, i) ? 1 : 0);
      b.add(v);
      bigB = bigB.multiply(v);
    }
    Z sum = Z.ZERO;
    for (final long v : b) {
      sum = sum.add(bigB.divide(v));
    }
    return sum.multiply2().add(s(d - 1, k - bigB.longValueExact()));
  }

  @Override
  public Z next() {
    return s(4, ++mN);
  }
}
