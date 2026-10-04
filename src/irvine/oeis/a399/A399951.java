package irvine.oeis.a399;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A399951 Sum of the sizes of the largest components over all functions on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A399951 extends A399664 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, j -> mB.get(mN, j).subtract(mB.get(mN, j - 1)).multiply(j));
  }
}
