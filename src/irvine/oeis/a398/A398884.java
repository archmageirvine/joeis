package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398884 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A398884 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Z.valueOf(m).pow(n).multiply(n).add(1);
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
