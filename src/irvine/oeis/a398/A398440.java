package irvine.oeis.a398;

import irvine.math.z.Z;

/**
 * A398440 Main diagonal of the array A398438.
 * @author Sean A. Irvine
 */
public class A398440 extends A398438 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
