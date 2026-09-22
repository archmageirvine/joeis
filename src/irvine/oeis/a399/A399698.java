package irvine.oeis.a399;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A399698 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A399698 extends A399697 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
