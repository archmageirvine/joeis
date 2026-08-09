package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a374.A374591;

/**
 * A398551 allocated for Liu Junhui.
 * @author Sean A. Irvine
 */
public class A398551 extends A374591 {

  private Z mA = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.equals(mA)) {
        mA = super.next();
      } else {
        return mN;
      }
    }
  }
}
