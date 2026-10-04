package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400450 The number of divisors d of n such that gcd(d, n/d) is prime.
 * @author Sean A. Irvine
 */
public class A400450 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (Predicates.PRIME.is(Functions.GCD.l(d, mN / d))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
