package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a283.A283626;

/**
 * A399189 allocated for Soslan Daurov.
 * @author Sean A. Irvine
 */
public class A399189 extends A283626 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).subtract(super.next());
  }
}

