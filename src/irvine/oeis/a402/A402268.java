package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A402268 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A402268 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final long m = n.divide2().longValueExact();
      Z min = n;
      for (long j = 2; j <= m; ++j) {
        min = min.min(Functions.GCD.z(n, Binomial.binomial(n, j)));
      }
      if (min.square().compareTo(n) > 0) {
        return n;
      }
    }
  }
}
