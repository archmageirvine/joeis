package irvine.oeis.a401;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401397 allocated for Sajid Hussain.
 * @author Sean A. Irvine
 */
public class A401397 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z b(final long n, final long m) {
    return n < m ? Z.ZERO : Binomial.binomial(n, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, i -> Z.NEG_ONE.pow(i).multiply(b(mN, i))
      .multiply(b(9 * mM - 10 * i + mN, mN).subtract(b(9 * mM - 9 - 10 * i + mN, mN))));
  }
}

