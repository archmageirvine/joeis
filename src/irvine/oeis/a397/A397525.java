package irvine.oeis.a397;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007238;

/**
 * A397525 a(n) = 2^(A007238(n)) * [x^n] B(x) where B(x) satisfies (B(x)^2-B(x^2))/2 = 1/(1-x)^2 with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A397525 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = Polynomial.create(Q.TWO);
  private static final Polynomial<Q> X1 = Polynomial.create(Q.NEG_ONE, Q.ONE);
  private static final Q NEG_TWO = new Q(-2);
  private Polynomial<Q> mB = TWO;
  private final Sequence mS = new A007238();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final Polynomial<Q> b2 = mB.substitutePower(2, mN + 1);
    final Polynomial<Q> t = RING.divide(RING.add(b2.shift(2), b2, RING.multiply(b2, NEG_TWO).shift(1), TWO), Q.FOUR);
    mB = RING.negate(RING.series(RING.multiply(RING.sqrt(t, mN + 1), Q.TWO), X1, mN + 1));
    return mB.coeff(mN).multiply(Z.ONE.shiftLeft(mS.next().longValueExact())).toZ();
  }
}
