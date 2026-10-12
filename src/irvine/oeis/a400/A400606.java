package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400606 a(n) = least m &gt;= 1 such that n*m^2 - 1 and n*m^2 + 1 are both prime, or 0 if there is no such m.
 * @author Sean A. Irvine
 */
public class A400606 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= 9 && Predicates.SQUARE.is(mN)) {
      return Z.ZERO;
    }
    long m = 0;
    while (true) {
      final Z s = Z.valueOf(++m).square().multiply(mN);
      if (Predicates.PRIME.is(s.subtract(1)) && Predicates.PRIME.is(s.add(1))) {
        return Z.valueOf(m);
      }
    }
  }
}
