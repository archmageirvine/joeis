package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A395861 allocated for Petro Kolosov.
 * @author Sean A. Irvine
 */
public class A395861 extends A395860 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
