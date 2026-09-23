package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399742 allocated for Yoshio Okita.
 * @author Sean A. Irvine
 */
public class A399742 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    if (m == 0) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(0, m - 1, k -> Binomial.binomial(k + n, n).shiftLeft(k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

