package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A397606 allocated for Zhuorui He.
 * @author Sean A. Irvine
 */
public class A397606 extends A397547 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
