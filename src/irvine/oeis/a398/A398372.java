package irvine.oeis.a398;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A398372 Triangle of denominators of coefficients of the polynomials generating the rows in A398004.
 * @author Sean A. Irvine
 */
public class A398372 extends A398371 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
