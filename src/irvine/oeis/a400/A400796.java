package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400796 allocated for Lluis Garcia Torcal.
 * @author Sean A. Irvine
 */
public class A400796 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long r = ++mN % 5;
    return Z.valueOf(mN).square().divide(5).add(r == 1 || r == 4 ? 1 : 0);
  }
}
