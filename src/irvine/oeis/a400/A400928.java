package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400928 Array read by ascending antidiagonals: A(n,k) = Sum_{m=0..n} binomial(n,m)^k, with k &gt;= 0.
 * @author Sean
 */
public class A400928 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).pow(m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}

