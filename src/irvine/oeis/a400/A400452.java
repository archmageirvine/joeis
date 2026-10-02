package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400452 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400452 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (Predicates.PRIME_POWER.is(Functions.GCD.l(d, mN / d))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
