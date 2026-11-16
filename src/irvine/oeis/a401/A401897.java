package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A401897 Number of Gaussian integers w with N(w) &lt; N(z) that are visible from z, where z = a+b*i is the n-th nonzero Gaussian integer with 0 &lt;= b &lt;= a, ordered by norm and then by b.
 * @author Sean A. Irvine
 */
public class A401897 extends TwoParameterFormSequence {

  private Z mCount = null;

  /** Construct the sequence. */
  public A401897() {
    super(1, 1, 0, (a, b) -> b > a ? null : Z.valueOf(a * a).add(b * b));
  }

  @Override
  protected boolean accept(final long a, final long b, final Z n, final Z prev) {
    long cnt = 0;
    final long r = Functions.SQRT.l(n);
    for (long x = -r; x <= r; ++x) {
      final Z x2 = Z.valueOf(x * x);
      for (long y = -r; y <= r; ++y) {
        if (Functions.GCD.l(Math.abs(x - a), Math.abs(y - b)) == 1 && x2.add(y * y).compareTo(n) < 0) {
          ++cnt;
        }
      }
    }
    mCount = Z.valueOf(cnt);
    return true;
  }

  @Override
  public Z next() {
    super.next();
    return mCount;
  }
}
