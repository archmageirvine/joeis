package irvine.oeis.a402;

import java.util.HashSet;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402177 allocated for Luc Rousseau.
 * @author Sean A. Irvine
 */
public class A402177 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private HashSet<Polynomial<Q>> mP = new HashSet<>();

  @Override
  public Z next() {
    if (mP.isEmpty()) {
      mP.add(RING.one());
    } else {
      final HashSet<Polynomial<Q>> next = new HashSet<>();
      for (final Polynomial<Q> p : mP) {
        next.add(RING.diff(p.shift(1)).shift(1));
        next.add(RING.add(RING.integrate(p.shift(-1)), RING.monomial(p.coeff(0), 0)));
      }
      mP = next;
    }
    return Z.valueOf(mP.size());
  }
}

