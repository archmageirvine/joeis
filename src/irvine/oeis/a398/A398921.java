package irvine.oeis.a398;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398921 allocated for David Bevan.
 * @author Sean A. Irvine
 */
public class A398921 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(2, mN / 2, k -> Z.valueOf((k - 1) * (mN / k) * (mN / k - 1))).divide2();
  }
}

