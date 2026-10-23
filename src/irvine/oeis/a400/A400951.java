package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400951 Triangle read by rows: T(n,k) is the minimum runtime for k threads to complete n tasks, where time(n_i) = i, with 1 &lt;= i &lt;= n.
 * @author Sean A. Irvine
 */
public class A400951 extends A400950 {

  @Override
  protected Z select(final Z ways, final long min) {
    return Z.valueOf(min);
  }
}
