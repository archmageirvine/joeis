package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A400761 Product of the 8 nearest neighbors of n in the square spiral.
 * @author Sean A. Irvine
 */
public class A400761 extends Sequence1 {

  private static final long[] DELTA_X = {0, 0, 1, -1, 1, 1, -1, -1};
  private static final long[] DELTA_Y = {1, -1, 0, 0, 1, -1, 1, -1};
  private long mN = 0;

  @Override
  public Z next() {
    final Z[] xy = ZUtils.ulamCoords(Z.valueOf(++mN));
    final Z x = xy[0];
    final Z y = xy[1];
    Z prod = Z.ONE;
    for (int k = 0; k < DELTA_X.length; ++k) {
      prod = prod.multiply(ZUtils.ulamValue(x.add(DELTA_X[k]), y.add(DELTA_Y[k])));
    }
    return prod;
  }
}

