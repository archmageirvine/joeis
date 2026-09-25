package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A399698 Denominator of delta_1(n), the density of the integers having exactly one divisor in the open interval (n, 2n).
 * @author Sean A. Irvine
 */
public class A399698 extends A399697 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
