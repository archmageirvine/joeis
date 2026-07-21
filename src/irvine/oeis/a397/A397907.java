package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a086.A152795;

/**
 * A397907 allocated for Paul D. Hanna.
 * @author Sean A. Irvine
 */
public class A397907 extends A152795 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(2 * ++mN, mN);
  }
}
