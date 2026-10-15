package irvine.oeis.a400;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A400876 Array read by ascending antidiagonals: A(n,k) = denominator((n^2 - 2*n*k - k^2)/(n^2 + k^2)), with k &gt; 0.
 * @author Sean A. Irvine
 */
public class A400876 extends A400875 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

