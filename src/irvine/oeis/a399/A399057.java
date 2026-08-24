package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a396.A396708;

/**
 * A399057 Denominators of Sum_{k=1..n} n^2/(k^2 + (n-k)^2).
 * @author Sean A. Irvine
 */
public class A399057 extends A396708 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
