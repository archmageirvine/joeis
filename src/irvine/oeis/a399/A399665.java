package irvine.oeis.a399;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A399665 Row sums of A399664.
 * @author Sean A. Irvine
 */
public class A399665 extends A399664 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> mB.get(mN, k));
  }
}
