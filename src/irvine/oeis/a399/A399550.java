package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399550 Pascal's cube: entries in the 3-dimensional multivariate Pascal matrix, read by cubes, slices, and rows.
 * @author Sean A. Irvine
 */
public class A399550 extends Sequence0 {

  private long mN = 0;
  private long mK = 0;
  private long mJ = 0;
  private long mI = -1;

  @Override
  public Z next() {
    if (++mI > mN) {
      if (++mJ > mN) {
        if (++mK > mN) {
          ++mN;
          mK = 0;
        }
        mJ = 0;
      }
      mI = 0;
    }
    return Binomial.binomial(mN, mI).multiply(Binomial.binomial(mN, mJ)).multiply(Binomial.binomial(mN, mK));
  }
}
