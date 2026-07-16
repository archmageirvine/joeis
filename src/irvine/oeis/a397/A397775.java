package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397775 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A397775 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  protected Z t(final long n, final long m) {
    return n == 0 ? Z.ONE : t(n - 1, m).multiply(n).add(m);
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
