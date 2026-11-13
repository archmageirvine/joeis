package irvine.oeis.a401;

import irvine.math.z.Z;

/**
 * A401736 Main diagonal of A401735.
 * @author Sean A. Irvine
 */
public class A401736 extends A401735 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, mN));
  }
}
