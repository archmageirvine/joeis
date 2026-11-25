package irvine.oeis.a402;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402353 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A402353 extends Sequence1 {

  // After Guido Avagliano

  private long mN = 0;

  private boolean is(final long n) {
    if (n != 10 && Functions.SIGMA1.z(n).compareTo(2 * n - 2) < 0) {
      return false;
    }
    final Z mask = Z.ONE.shiftLeft(n + 1).subtract(1);
    Z s = Z.ONE;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      s = s.or(s.shiftLeft(d)).and(mask);
    }
    final Z missing = s.not().and(Z.ONE.shiftLeft(n).subtract(2));
    return missing.bitCount() == 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
