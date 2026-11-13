package irvine.oeis.a401;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401397 Triangle read by rows: T(n,k) is the number of decimal strings of length n with k indispensable digits, with 0 &lt;= k &lt;= n.
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

