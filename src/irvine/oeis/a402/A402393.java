package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402393 a(n) is the largest j &gt;= 0 such that 3^j*n reaches 1 in exactly j fewer Collatz steps than n: A006577(3^j*n) = A006577(n) - j.
 * @author Sean A. Irvine
 */
public class A402393 extends Sequence1 {

  private long mN = 0;

  private long steps(Z n) {
    long cnt = 0;
    while (!n.isOne()) {
      n = Functions.COLLATZ.z(n);
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    final long t = steps(m);
    long best = 0;
    for (long j = 1; j <= t; ++j) {
      m = m.multiply(3);
      if (steps(m) == t - j) {
        best = j;
      }
    }
    return Z.valueOf(best);
  }
}
