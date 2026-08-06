package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397600 allocated for Hiller Alves Fernandes.
 * @author Sean A. Irvine
 */
public class A397600 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  protected Z t(final long n, final long k) {
    final long x = n / 2;
    final long y = (n + 1) / 2;
    return Z.valueOf(x * x + y * y).pow(k).subtract(Z.valueOf(n).pow(k)).divide2();
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
