package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A395971 Triangular array T(n, k) read by rows: Row n gives the even coefficients of the polynomial P_n(x) = Sum_{k=0..n} x^(2*(n-k))*T(n, k), this is the polynomial of order 2*n that satisfies (-1)^n*P_n(k-n)/(n!)^2 = binomial(2*n, k) for integers k = 0..2*n.
 * @author Sean A. Irvine
 */
public class A395971 extends Triangle {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> mPoly = null;
  private int mN = -1;
  private Z mF = Z.ONE;

  /** Construct the sequence. */
  public A395971() {
    hasRAM(true);
  }

  private Polynomial<Q> interpolate(final int n) {
    Polynomial<Q> sum = RING.zero();

    for (int j = -n; j <= n; ++j) {
      Polynomial<Q> basis = RING.one();
      Q denom = Q.ONE;
      for (int m = -n; m <= n; ++m) {
        if (m != j) {
          basis = RING.multiply(basis, Polynomial.create(new Q(-m), Q.ONE));
          denom = denom.multiply(j - m);
        }
      }
      final Q scale = new Q(Binomial.binomial(2L * n, j + n)).divide(denom);
      sum = RING.add(sum, RING.multiply(basis, scale));
    }

    return sum;
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n != mN) {
      mN = n;
      mPoly = interpolate(n);
      mF = Functions.FACTORIAL.z(n).square();
    }
    final int degree = 2 * (n - k);
    final Q c = mPoly.coeff(degree);
    return c.multiply(mF).toZ().multiply((n & 1) == 0 ? Z.ONE : Z.NEG_ONE);
  }
}
