package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400955 Triangle read by rows: T(n,k) is the minimum runtime for k threads to complete n tasks, where time(n_i) = 2^(i-1), with 1 &lt;= i &lt;= n.
 * @author Sean A. Irvine
 */
public class A400955 extends A400954 {

  @Override
  protected Z select(final Z ways, final long min) {
    return Z.valueOf(min);
  }
}
