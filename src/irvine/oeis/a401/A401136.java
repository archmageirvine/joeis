package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401136 allocated for Yagel Bar.
 * @author Sean A. Irvine
 */
public class A401136 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.PRIMORIAL_COUNT.z(n - 1).multiply(Functions.PRIME.z(n).pow(m)).subtract(1);
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
