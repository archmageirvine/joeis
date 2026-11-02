package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401436 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A401436 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    final long q = n / m;
    return Z.valueOf(q + 1).multiply(2 * n - m * q + 2).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM + 1);
  }
}

