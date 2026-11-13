
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401452 Number of Young tableaux with walls of period n whose basic blocks are Z3, where Z3 is a special class of Young diagram with walls of shape 2 X 2.
 * @author Sean A. Irvine
 */
public class A401452 extends Sequence1 {

  // After Karan Sharma

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> W1 = Polynomial.create(Q.ONE, Q.NEG_ONE);
  private static final Polynomial<Q> W = Polynomial.create(Q.HALF, Q.ZERO, Q.HALF.negate());
  private int mN = -1;

  private Polynomial<Q> up(final Polynomial<Q> f) {
    final Polynomial<Q> i = RING.integrate(f);
    return RING.subtract(RING.monomial(RING.eval(i, Q.ONE), 0), i);
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> f = Polynomial.create(Q.ONE);
    for (long k = mN; k > 0; --k) {
      f = up(f);
      final Polynomial<Q> w = k == 1 ? W1 : W;
      f = up(RING.multiply(f, w));
    }
    return f.coeff(0).multiply(Functions.FACTORIAL.z(4 * mN)).toZ();
  }
}
