package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396059 allocated for Mia Boudreau.
 * @author Sean A. Irvine
 */
public class A396059 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((2 * ++mN) ^ (mN / 2));
  }
}
