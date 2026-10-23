package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398564 allocated for Ahaan Kallat.
 * @author Sean A. Irvine
 */
public class A398564 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN).multiply(mM).divide(Functions.RAD.l(Functions.GCD.l(mN, mM)));
  }
}

