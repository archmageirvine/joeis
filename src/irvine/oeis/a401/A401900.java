package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401900 allocated for Sergii Voloshyn.
 * @author Sean A. Irvine
 */
public class A401900 extends Sequence0 {

  // T(n,k) = Sum_{j=0..k} (-1)^j*binomial(3*n+1,j)*P_n(k-j), for n >= 0 and 0 <= k <= 2*n where P_n(r) = 4^n*(r+1/2)_n*(r+1)_n*(r+3/2)_n/(n!*(3/2)_n*(n+1)!) and (x)_n indicates the rising factorial.
  /*
  p[n_Integer?NonNegative, r_Integer?NonNegative] := 4^n*Pochhammer[r+1/2, n]*Pochhammer[r+1, n]*Pochhammer[r+3/2, n]/(n!*Pochhammer[3/2, n]*(n+1)!);

a[n_Integer?NonNegative, k_Integer?NonNegative] := Sum[(-1)^j*Binomial[3*n+1, j]*p[n, k-j], {j, 0, k}];
   */

  private long mN = 0;
  private long mM = -1;

  private Q risingFactorial(final Q x, final long n) {
    Z p = x.num();
    Z q = x.den();
    Z numerator = Z.ONE;
    for (long k = 0; k < n; ++k) {
      numerator = numerator.multiply(p.add(q.multiply(k)));
    }
    return new Q(numerator, q.pow(n));
  }

  private Z p(final long n, final long r) {
    return risingFactorial(new Q(2 * r + 1, 2), n)
      .multiply(Functions.RISING_FACTORIAL.z(r + 1, n))
      .multiply(risingFactorial(new Q(2 * r + 3, 2), n))
      .multiply(Z.ONE.shiftLeft(2 * n))
      .divide(Functions.FACTORIAL.z(n))
      .divide(Functions.FACTORIAL.z(n + 1))
      .divide(risingFactorial(new Q(3, 2), n))
      .toZ();
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(3 * mN + 1, j)).multiply(p(mN, mM - j)));
  }
}
