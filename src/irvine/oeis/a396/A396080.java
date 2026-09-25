package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396080 Number of rooted trees with total node weight n where nodes have positive integer weights and no node has the same weight as its parent node.
 * @author Sean A. Irvine
 */
public class A396080 extends Sequence0 {

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
    return mA.coeff(mN).toZ();
  }
}
