package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399985 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A399985 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = RING.zero();
  private final List<Polynomial<Q>> mB = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(RING.zero());
    } else {
      mB.add(RING.monomial(Q.ONE, mB.size()));
      for (int j = 1; j <= mN; ++j) {
        Polynomial<Q> sum = RING.zero();
        for (int k = 1; k <= mN; ++k) {
          final Polynomial<Q> tk = RING.divide(RING.subtract(mA.substitutePower(k), mB.get(j).substitutePower(k)), Q.valueOf(k));
          sum = RING.add(sum, tk);
        }
        final Polynomial<Q> bj = RING.exp(sum, mN).shift(j);
        mB.set(j, bj);
      }
    }
    mA = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      mA = RING.add(mA, mB.get(k));
    }
    Polynomial<Q> a2 = RING.pow(mA, 2, mN);
    for (int i = 1; i < mB.size(); ++i) {
      a2 = RING.subtract(a2, RING.pow(mB.get(i), 2, mN));
    }
    return mA.coeff(mN).subtract(a2.coeff(mN).divide(2)).toZ();
  }
}
