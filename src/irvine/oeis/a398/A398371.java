package irvine.oeis.a398;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398371 Triangle of numerators of coefficients of the polynomials generating the rows in A398004.
 * @author Sean A. Irvine
 */
public class A398371 extends Sequence1 {

  // After Eric Tr&eacute;buchon

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private final ArrayList<Polynomial<Q>> mRows = new ArrayList<>();
  private int mK = 0;
  private int mN = 1;
  private int mM = 0;

  /**
   * Compute the polynomial whose forward difference is p,
   * with F(1) = 0. Thus, F(n) - F(n-1) = p(n).
   * This gives Sum_{i=2}^n p(i) after subsequently adding p(1).
   */
  private Polynomial<Q> sumFrom2(final Polynomial<Q> p) {
    final int d = p.degree();
    // F(n) = sum_{i=2}^n p(i), so F(1) = 0.
    // F has degree d+1.  Evaluate at x = 1,...,d+2.
    final Q[] values = new Q[d + 2];
    Q s = Q.ZERO;
    for (int n = 1; n <= d + 2; ++n) {
      if (n >= 2) {
        s = s.add(RING.eval(p, Q.valueOf(n)));
      }
      values[n - 1] = s;
    }

    // Newton interpolation about x=1:
    // F(x) = sum_j Delta^j F(1) * binomial(x-1,j).
    Polynomial<Q> result = RING.zero();
    Polynomial<Q> binom = Polynomial.create(Q.ONE); // C(x-1, 0) = 1

    final Q[] diff = values.clone();
    for (int j = 0; j <= d + 1; ++j) {
      result = RING.add(result, RING.multiply(binom, diff[0]));
      for (int i = 0; i < diff.length - 1; ++i) {
        diff[i] = diff[i + 1].subtract(diff[i]);
      }
      if (j < d + 1) {
        // C(x-1,j+1) = C(x-1,j) * (x-1-j)/(j+1)
        final Polynomial<Q> factor = Polynomial.create(new Q(-j - 1), Q.ONE);
        binom = RING.multiply(binom, factor);
        binom = RING.multiply(binom, new Q(1, j + 1));
      }
    }
    return result;
  }

  private Polynomial<Q> row(final int n) {
    while (mK < n) {
      if (++mK == 1) {
        mRows.add(RING.x());
      } else {
        final Polynomial<Q> prev = mRows.get(mK - 2);
        // Sum_{i=2}^x P_{k-1}(i) + x(x+1)/2 + k*x - 1
        final Polynomial<Q> p = RING.add(sumFrom2(prev), Polynomial.create(Q.NEG_ONE, new Q(2L * mK + 1, 2), Q.HALF));
        mRows.add(p);
      }
    }
    return mRows.get(n - 1);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Polynomial<Q> p = row(mN);
    final Z result = select(p.coeff(p.degree() - mM));
    if (++mM > p.degree()) {
      ++mN;
      mM = 0;
    }
    return result;
  }
}
