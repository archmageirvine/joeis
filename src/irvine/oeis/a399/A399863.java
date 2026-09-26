package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399863 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399863 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN + 1, 2)
      .subtract(Binomial.binomial(mN - mM + 1, 2))
      .add(Binomial.binomial(mN + mM, 2))
      .subtract(mN - mM + 1 > mM ? Binomial.binomial(mN - 2 * mM + 1, 2) : Z.ZERO);
  }
}
// T(n,k) = binomial(n+1,2) - binomial(n-k+1,2) + binomial(n+k,2) - [n-k+1 > k]*binomial(n-2*k+1,2), k = 1..n
