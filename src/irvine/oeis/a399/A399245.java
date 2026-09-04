package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399245 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399245 extends Sequence1 {

  private static final CR X = CR.PHI;
  private static final CR INV_X = X.inverse();
  private static final CR T = CR.ONE.subtract(INV_X);
  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return INV_X.multiply(X.pow(n).multiply(m).floor()).frac().compareTo(T) > 0 ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}

