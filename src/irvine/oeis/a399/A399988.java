package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399988 Irregular triangle read by rows: Sum_{m&gt;=2} (-1)^m/A000217(m)^n = T(n,0) + T(n,1)*log(2) + Sum_{k=2..ceiling(n/2)} T(n,k)*zeta(2*k-1).
 * @author Sean A. Irvine
 */
public class A399988 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long j) {
    return Binomial.binomial(2 * n - j - 1, n - 1).multiply(Z.NEG_ONE.pow(n - j));
  }

  @Override
  public Z next() {
    if (2 * ++mM > mN + 1) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return Integers.SINGLETON.sum(1, mN, j -> t(mN, j).multiply(Z.ONE.subtract(Z.NEG_ONE.pow(j)).shiftLeft(mN).add(Z.NEG_ONE.pow(j).shiftLeft(mN - j))));
    } else {
      final Z s = Z.ONE.shiftLeft(mN + 1);
      return t(mN, 2 * mM - 1).multiply(mM == 1 ? s : s.subtract(Z.ONE.shiftLeft(mN + 3 - 2 * mM))).negate();
    }
  }
}
