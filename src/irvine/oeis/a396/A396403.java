package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396403 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A396403 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return Z.valueOf(m).pow(Functions.TRIANGULAR.l(n - 1));
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
