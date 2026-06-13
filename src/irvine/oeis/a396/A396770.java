package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396770 Number of unlabeled connected nonnegative partially ordered sets ("posets") of size n and Dynkin type A.
 * @author Sean A. Irvine
 */
public class A396770 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.PHI.z(d).shiftLeft(mN / d)).divide(2 * mN)
      .add(Z.ONE.shiftLeft(mN - 1).add(Z.ONE.shiftLeft((mN + 1) / 2 - 1).subtract(mN + 1)).divide2());
  }
}
