package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A399907 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399907 extends A399908 {

  private int mN = 0;
  {
    setOffset(2);
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> seen = new HashSet<>();
    seen.add(0L);
    final long s0 = t(mN, 1);
    seen.add(s0);
    for (int k = 0; k < s0; ++k) {
      seen.add(t(mN, k + 2));
    }
    return Z.valueOf(LongUtils.mex(seen));
  }
}
