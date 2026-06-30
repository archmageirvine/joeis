package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396382 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A396382 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    if (m == 1) {
      return Z.valueOf(n);
    }
    if (Functions.GCD.l(n, m) > 1) {
      return Z.ZERO;
    }
    final Z k = Z.valueOf(m);
    return k.subtract(Z.valueOf(n).modInverse(k)).multiply(n);
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
