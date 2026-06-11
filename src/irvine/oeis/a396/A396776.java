package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A395642.
 * @author Sean A. Irvine
 */
public class A396776 extends Sequence3 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN - mM + 3).multiply(mM + 1);
  }
}
