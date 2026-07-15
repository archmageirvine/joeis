package irvine.oeis.a396;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a010.A010051;
import irvine.oeis.a032.A032171;

/**
 * A396511 Number of Lyndon compositions of n whose parts are prime.
 * @author Sean A. Irvine
 */
public class A396511 extends A010051 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = 0;

  @Override
  public Z next() {
    mA.add(new Q(super.next()));
    return A032171.chk(mA.shift(1), ++mN).coeff(mN).toZ();
  }
}
