package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396989 allocated for Shreyhaan Sarkar.
 * @author Sean A. Irvine
 */
public class A396989 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("u", Rationals.SINGLETON, mN);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Q> half = inner.create(Collections.singletonList(Q.HALF));

    final List<Polynomial<Polynomial<Q>>> bigR = new ArrayList<>();
    while (bigR.size() <= mN) {
      final int i = bigR.size();
      final Polynomial<Polynomial<Q>> u = ring.monomial(inner.x(), 0);
      if (i == 0) {
        bigR.add(ring.monomial(inner.x(), 1)); // R0 = x*u
      } else {
        bigR.add(ring.shift(ring.subtract(ring.add(u, ring.exp(bigR.get(i - 1), mN)), ring.one()), 1));
      }
    }

    Q sum = Q.ZERO;
    for (int d = 1; d <= mN - 1; ++d) {
      final Polynomial<Polynomial<Q>> bigF;
      if ((d & 1) == 1) {
        final int r = (d - 1) / 2;
        if (r == 0) {
          bigF = ring.multiply(ring.multiply(bigR.get(0), bigR.get(0), mN), half);
        } else {
          final Polynomial<Polynomial<Q>> diff = ring.subtract(bigR.get(r), bigR.get(r - 1));
          bigF = ring.multiply(ring.multiply(diff, diff, mN), half);
        }
      } else {
        final int r = d / 2;
        final Polynomial<Polynomial<Q>> a = bigR.get(r - 1);
        final Polynomial<Polynomial<Q>> b = (r >= 2) ? bigR.get(r - 2) : ring.zero();
        final Polynomial<Polynomial<Q>> expA = ring.exp(a, mN);
        final Polynomial<Polynomial<Q>> expB = ring.exp(b, mN);
        final Polynomial<Polynomial<Q>> diff = ring.subtract(a, b);
        bigF = ring.subtract(ring.subtract(expA, expB), ring.multiply(diff, expB, mN)).shift(1);
      }
      sum = sum.add(bigF.coeff(mN).coeff(d));
    }
    return sum.multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
