package irvine.oeis.a399;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a395.A395685;

/**
 * A399204 Number of permutations that give the minimum number of comparisons for sorting n elements by binary insertion.
 * @author Sean A. Irvine
 */
public class A399204 extends A395685 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN - LongUtils.ceilLog2(mN + 1));
  }
}
