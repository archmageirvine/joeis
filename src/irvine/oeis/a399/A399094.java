package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399094 Triangle read by rows formed by the nested recurrences H_m(n) = 1 + max_{1 &lt;= j &lt;= m} H_m(n - H_m(n-j)), with H_m(1) = ... = H_m(m) = 1.
 * @author Sean A. Irvine
 */
public class A399094 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (n <= m) {
      return Z.ONE;
    }
    if (n < 2 * m) {
      return Z.valueOf(n - m + 1);
    }
    return Z.valueOf((1 + Functions.SQRT.l(1 + 8L * (n - 2L * m + Functions.TRIANGULAR.l(m)))) / 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
