package irvine.oeis.a401;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401854: T(n,k) = (n-k+1)/(n+1)*binomial(n+k,k) - binomial(n-1,k) for k>=1, T(n,0) = A000007(n).
 * @author Sean A. Irvine
 */
public class A401823 extends Sequence0 {

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
    return Binomial.binomial(mN + mM, mM).multiply(mN - mM + 1).divide(mN + 1).subtract(Binomial.binomial(mN - 1, mM));
  }
}
