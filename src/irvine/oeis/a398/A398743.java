package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398743 allocated for Jules Beauchamp.
 * @author Sean A. Irvine
 */
public class A398743 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * (2 - (mN & 1))) {
      ++mN;
      mM = 1;
    }
    return mM == 1 ? Z.ONE : Functions.TRIANGULAR.z(mM - 1).add(1).modZ(mN);
  }
}
