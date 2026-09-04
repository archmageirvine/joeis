package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397479 Triangle read by rows: T(n, k) is the least m such that moving the rightmost digit of m to the left end multiplies m by k, where m is written in base n; n &gt;= 2, 1 &lt;= k &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A397479 extends Sequence2 {

  // After Ansh Aggarwal

  private int mN = 0;

  private long e(final long n, final long m, final long d) {
    final long q = m / Functions.GCD.l(m, d);
    long j = 1;
    long x = n % q;
    while (x != 1 % q) {
      x = (x * n) % q;
      ++j;
    }
    return j;
  }

  private Z t(final long n, final long k) {
    final long m = n * k - 1;
    Z min = null;
    for (long d = k; d < n; ++d) {
      final Z t = Z.valueOf(n).pow(e(n, m, d)).subtract(1).multiply(d).divide(m);
      if (min == null || t.compareTo(min) < 0) {
        min = t;
      }
    }
    return min;
  }

  @Override
  public Z next() {
    long n = ++mN;
    long b = 2;
    while (n > b - 1) {
      n -= b - 1;
      ++b;
    }
    return t(b, n);
  }
}

