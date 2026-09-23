package irvine.oeis.a399;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399692 allocated for Alexander Krivilev.
 * @author Sean A. Irvine
 */
public class A399692 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > LongUtils.floorLog2(mN) + 2) {
      ++mN;
      mM = 1;
    }
    return Z.ONE.shiftLeft(mM - 1).add(mN).shiftRight(mM);
  }
}
