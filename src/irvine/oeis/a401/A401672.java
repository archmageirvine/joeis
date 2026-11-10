package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401673
 * @author Sean A. Irvine
 */
public class A401672 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN * mN + mM * mM + mN * mM + mN + mM);
  }
}

