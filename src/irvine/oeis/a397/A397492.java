package irvine.oeis.a397;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a396.A396351;

/**
 * A397492 allocated for Ramin Mohammadi Masoudi.
 * @author Sean A. Irvine
 */
public class A397492 extends A396351 {

  @Override
  protected Z t(final int n, final int m) {
    return Binomial.binomial(Binomial.binomial(2L * n + 2, 3).add(m - 1), m).subtract(super.t(n, m));
  }
}
