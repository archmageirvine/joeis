package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397049.
 * @author Sean A. Irvine
 */
public class A398029 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    final long m = mN * mN - mN;
    return Z.valueOf(mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN)).subtract(1)
      .multiply(Z.valueOf(mN).pow(m).subtract(Z.valueOf(mN - 1).pow(m).multiply2()).add(Z.valueOf(mN - 2).pow(m)).subtract(Z.TWO.pow(m)).add(2));
  }
}
