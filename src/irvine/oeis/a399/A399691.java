package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A399691 Denominator of delta(n), the density of the integers that are divisible by some integer in the open interval (n, 2n).
 * @author Sean A. Irvine
 */
public class A399691 extends A399690 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
