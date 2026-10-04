package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400324 Irregular triangle read by rows, where row n gives the lengths of consecutive same species move blocks in the solution of the Frogs and Toads interchange puzzle with n frogs and n toads.
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

