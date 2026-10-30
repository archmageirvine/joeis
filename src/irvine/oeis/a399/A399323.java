package irvine.oeis.a399;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399323 Triangle read by rows: T(n,t), 1 &lt;= t &lt;= n, of the polynomial family defined by T(n,0)=1, T(t,t)=T(t,t-1), dT(n,t)/dn = s*t*T(n,t-1) for s=2.
 * @author Sean A. Irvine
 */
public class A399323 extends Sequence1 {

  // Current polynomial, coefficients in ascending degree order.
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mP = RING.one();
  private int mN = 0;
  private int mM = 0;

  private Polynomial<Z> extend(final Polynomial<Z> old, final int t) {
    final Z[] p = new Z[old.size() + 1];
    p[0] = Z.ZERO;
    // P_t'(x) = 2*t*P_{t-1}(x).
    for (int k = 1; k < p.length; ++k) {
      final Z numerator = old.coeff(k - 1).multiply(2L * t);
      p[k] = numerator.divide(Z.valueOf(k));
    }
    // Set P_t(t) = P_{t-1}(t).
    Z constant = RING.eval(old, Z.valueOf(t));
    Z power = Z.ONE;
    for (int k = 1; k < p.length; ++k) {
      power = power.multiply(t);
      constant = constant.subtract(p[k].multiply(power));
    }
    p[0] = constant;
    return Polynomial.create(p);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mP = RING.one();
      mM = 1;
    }
    // Advance from P_{t-1} to P_t.
    mP = extend(mP, mM);
    return RING.eval(mP, Z.valueOf(mN));
  }
}
