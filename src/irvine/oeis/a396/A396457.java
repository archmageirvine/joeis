package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396457 Triangle T(n, k) of convolved numbers of k-sections of the Fibonacci sequence at the first convolution order, for n &gt;= 1 and 1 &lt;= k &lt;= n, read by rows.
 * @author Sean A. Irvine
 */
public class A396457 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Integers.SINGLETON.sum(0, (n - 1) / 2, k -> Binomial.binomial(n - 1 - k, k).multiply(Functions.LUCAS.z(m).pow(n - 1 - 2 * k)).multiply(n - k).multiply(Z.NEG_ONE.pow(k * (m - 1))));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM + 1, mM);
  }
}
