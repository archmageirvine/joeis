package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400324 allocated for Dario T. de Castro.
 * @author Sean A. Irvine
 */
public class A400324 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > 2 * mN + 1) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(Math.min(Math.min(mM, 2 * mN + 2 - mM), mN));
  }
}

