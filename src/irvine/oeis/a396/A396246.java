package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396246 Triangle read by rows: T(n,m) is the number of ways to fill an m X n grid by using the numbers 1, 2, ..., m*n exactly once, so that 1 is the only entry which is the smallest both in its row and in its column, 1 &lt;= m &lt;= n.
 * @author Sean A. Irvine
 */
public class A396246 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mN * mM).multiply(Functions.FACTORIAL.z(mN)).multiply(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z(mN + mM - 1));
  }
}
