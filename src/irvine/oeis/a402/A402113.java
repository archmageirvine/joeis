package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402113 allocated for Eddie Lin Rui.
 * @author Sean A. Irvine
 */
public class A402113 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(2 * n * m + (n >= 2 ? 2 : 0));
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
