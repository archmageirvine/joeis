package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400916 allocated for Eddie Lin Rui.
 * @author Sean
 */
public class A400916 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(2 * m + 1).pow(n).subtract(Z.valueOf(2 * m - 1).pow(n));
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

