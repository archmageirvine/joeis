package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400571 allocated for Eddie Lin Rui.
 * @author Sean A. Irvine
 */
public class A400571 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    final long q = k / n;
    final long r = k % n;
    if (r == 0) {
      return Z.valueOf(q + 1).pow(n - 1).multiply(2 * n);
    } else {
      return Z.valueOf(q + 1).pow((n - r - 1)).multiply(Z.valueOf(q + 2).pow(r - 1)).multiply(n * q + 2 * n - r).multiply2();
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}
