package irvine.oeis.a396;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A396240 allocated for Edward Bernstein.
 * @author Sean A. Irvine
 */
public class A396240 extends A396239 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
