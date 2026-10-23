
package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399695 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A399695 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    return Integers.SINGLETON.sum(0, n / k, m -> Binomial.binomial(n - k * m + 2, 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM + 1);
  }
}
