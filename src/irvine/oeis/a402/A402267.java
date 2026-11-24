package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a034.A034699;

/**
 * A402267 Composite numbers k such that min_{1&lt;j&lt;=k/2} gcd(k, binomial(k,j)) = k/A034699(k).
 * @author Sean A. Irvine
 */
public class A402267 extends A034699 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (Predicates.COMPOSITE.is(mN)) {
        final long r = mN / t.longValueExact();
        long min = mN;
        for (long j = 2; j <= mN / 2; ++j) {
          final long g = Functions.GCD.z(mN, Binomial.binomial(mN, j)).longValueExact();
          if (g < min) {
            min = g;
          }
        }
        if (r == min) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
