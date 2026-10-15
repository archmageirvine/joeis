package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a061.A061260;

/**
 * A400783 Number of unordered 4-element sets of partitions summing to n.
 * @author Sean A. Irvine
 */
public class A400783 extends A061260 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, 4, k -> t(mN, k.intValue()));
  }
}
