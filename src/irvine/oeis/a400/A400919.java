package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400919 Sum of the remainders of n modulo the odd numbers 3, 5, ..., 2*floor(n/3)+1.
 * @author Sean A. Irvine
 */
public class A400919 extends Sequence1 {

  // After Carlo Nurra

  private long mN = 0;

  @Override
  public Z next() {
    final long x = ++mN / 3;
    long sum = x * (x + 2);
    long j = 2;
    while (j <= x) {
      final long q = mN / j;
      final long j2 = Math.min(mN / q, x);
      final long m = (q + 1) / 2;
      sum += (j2 - j + 1) * (m * m - 1);
      j = j2 + 1;
    }
    return Z.valueOf(mN * x - sum);
  }
}
