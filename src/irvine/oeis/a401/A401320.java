package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401320 allocated for Geoffrey Critzer.
 * @author Sean A. Irvine
 */
public class A401320 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> Y1 = RING.onePlusXToTheN(1);

  // mG[n][k] is the Gaussian binomial polynomial [n choose k]_q, evaluated at q = 1+y.
  private final List<List<Polynomial<Z>>> mG = new ArrayList<>();

  // mT[n] is the polynomial whose coefficient of y^k is T(n,k).
  private final List<Polynomial<Z>> mT = new ArrayList<>();

  private int mN = 0;
  private int mM = -1;

  /** Construct the sequence. */
  public A401320() {
    mG.add(new ArrayList<>());
    mG.get(0).add(RING.one());
    mT.add(RING.one());
  }

  /**
   * Multiply by (1+y)^p.
   * @param a polynomial
   * @param p exponent
   * @return product
   */
  private static Polynomial<Z> multiplyQPower(final Polynomial<Z> a, final int p) {
    return RING.multiply(a, RING.pow(Y1, p));
  }

  /**
   * Ensure that Gaussian binomial polynomials through row n are available.
   * The recurrence is
   * [n choose k]_q = [n-1 choose k]_q + q^(n-k) [n-1 choose k-1]_q.
   * @param n row index
   */
  private void ensureGaussian(final int n) {
    while (mG.size() <= n) {
      final int r = mG.size();
      final List<Polynomial<Z>> prev = mG.get(r - 1);
      final List<Polynomial<Z>> curr = new ArrayList<>();
      for (int k = 0; k <= r; ++k) {
        if (k == 0 || k == r) {
          curr.add(RING.one());
        } else {
          curr.add(RING.add(prev.get(k), multiplyQPower(prev.get(k - 1), r - k)));
        }
      }
      mG.add(curr);
    }
  }

  /**
   * Compute the polynomial for row n using
   * T_n(y) = sum_{i=1}^n [n choose i]_q T_{n-i}(y), with q=1+y.
   * @param n row index
   */
  private void ensureRow(final int n) {
    while (mT.size() <= n) {
      final int r = mT.size();
      ensureGaussian(r);
      Polynomial<Z> row = RING.zero();
      for (int i = 1; i <= r; ++i) {
        row = RING.add(row, RING.multiply(mG.get(r).get(i), mT.get(r - i)));
      }
      mT.add(row);
    }
  }

  @Override
  public Z next() {
    if (++mM > Functions.BINOMIAL.l(mN, 2)) {
      ensureRow(++mN);
      mM = 0;
    }
    return mT.get(mN).coeff(mM);
  }
}
