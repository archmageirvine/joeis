package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398929 allocated for Rafael Andres Pastrana Tordecilla.
 * @author Sean A. Irvine
 */
public class A398929 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN + mN / 3 + (mN & 1));
  }
}
