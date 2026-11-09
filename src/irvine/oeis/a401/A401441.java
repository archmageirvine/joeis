package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401441 Square array A(n,k), n &gt;= 1, k &gt;= 1, read by antidiagonals (A(1,1), A(1,2), A(2,1), A(1,3), A(2,2), A(3,1), ...): A(n,k) is the number of divisors d of n such that gcd(d, n/d) is a k-th power.
 * @author Sean A. Irvine
 */
public class A401441 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final long t = 2 * (e / (2 * k)) + 1 + (e % (2 * k) == 0 ? 0 : 1);
      prod = prod.multiply(t);
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}
