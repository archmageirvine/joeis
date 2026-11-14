package irvine.oeis.a401;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401854: T(n,k) = Sum_{i=0..n-k} binomial(n-k, i)*((n-i-k+2)/(n-i+1)*binomial(n-i+k-1,k-1) - binomial(n-i-2,k-1) ) for k >= 2.
 * @author Sean A. Irvine
 */
public class A401822 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    if (mM == 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, mN - mM, k -> Binomial.binomial(mN - mM, k).multiply(Binomial.binomial(mN - k + mM - 1, mM - 1).multiply(mN - mM - k + 2).divide(mN - k + 1).subtract(Binomial.binomial(mN - k - 2, mM - 1))));
  }
}
