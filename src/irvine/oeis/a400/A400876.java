package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A400876 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A400876 extends A400875 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

