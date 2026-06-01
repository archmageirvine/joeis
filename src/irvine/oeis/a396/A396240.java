package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A396240 Denominator of r(n) = (prime(n+2) - 2*prime(n+1) + prime(n)) / (prime(n+2) - prime(n)).
 * @author Sean A. Irvine
 */
public class A396240 extends A396239 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
