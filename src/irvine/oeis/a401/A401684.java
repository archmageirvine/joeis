package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A401684 extends Sequence1 {

  private long mN = -22;

  @Override
  public Z next() {
    mN += 36;
    return Z.valueOf(mN);
  }
}
