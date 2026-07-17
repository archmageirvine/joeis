package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A397690 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A397690 extends Sequence0 {

  private long mN = -1;
  private final int[] mCounts = new int[10];

  @Override
  public Z next() {
    final int[] c = ZUtils.digitCounts(++mN);
    Z prod = Z.ONE;
    for (int k = 0; k < mCounts.length; ++k) {
      prod = prod.multiply(Binomial.binomial(mCounts[k], c[k]).multiply(Functions.FACTORIAL.z(c[k])));
    }
    for (int k = 0; k < mCounts.length; ++k) {
      mCounts[k] += c[k];
    }
    return prod;
  }
}
