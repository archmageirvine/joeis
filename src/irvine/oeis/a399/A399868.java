package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399868 Array read by upwards antidiagonals: T(n,k) is the coefficient of x^n in (1 - (1 - 9*3^k*x)^(3^(-k - 1)))/(3*x) for n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A399868 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  // T(n,k) = (-1)^n * binomial(3^(-k - 1), n + 1) * 3^((k + 2)*(n + 1) - 1).
  private Z t(final long n, final long k) {
    return Q.NEG_ONE.pow(n).multiply(Binomial.binomial(new Q(Z.ONE, Z.THREE.pow(k + 1)), n + 1)).multiply(Z.THREE.pow((k + 2) * (n + 1) - 1)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
