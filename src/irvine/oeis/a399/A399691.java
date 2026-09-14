package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A399691 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A399691 extends A399690 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
