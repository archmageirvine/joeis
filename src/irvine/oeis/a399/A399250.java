package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399250 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399250 extends Sequence1 {

  private static final CR X = CR.FIVE.sqrt().add(1);
  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return X.pow(n).multiply(m).floor();
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

