package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a393.A393538;

/**
 * A397827 allocated for Naveed Javeed.
 * @author Sean A. Irvine
 */
public class A397827 extends A393538 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

