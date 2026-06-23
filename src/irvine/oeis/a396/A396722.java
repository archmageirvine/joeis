package irvine.oeis.a396;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396722 a(n) = (4^n/2) * p(n, 5/2), where p(n,x) is the Lagrange interpolating polynomial through (1,0) and (k,1) for k=2..n+1.
 * @author Sean A. Irvine
 */
public class A396722 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q C = new Q(5, 2);
  private int mN = -1;

  @Override
  public Z next() {
    final long[] x = new long[++mN + 1];
    final long[] y = new long[mN + 1];
    for (int k = 0; k < x.length; ++k) {
      x[k] = k + 1;
    }
    Arrays.fill(y, 1);
    y[0] = 0;
    final Polynomial<Q> p = PolynomialUtils.lagrangeInterpolate(x, y);
    return RING.eval(p, C).multiply(Z.ONE.shiftLeft(2L * mN - 1)).toZ();
  }
}
