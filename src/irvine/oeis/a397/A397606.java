package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A397606 a(n) = denominator of A069835(n)/2^n.
 * @author Sean A. Irvine
 */
public class A397606 extends A397547 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
