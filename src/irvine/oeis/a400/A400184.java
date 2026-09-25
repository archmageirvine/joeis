package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a397.A397831;

/**
 * A400184 Odd numbers missing from A397831.
 * @author Sean A. Irvine
 */
public class A400184 extends A397831 {

  private long mA = super.next().longValueExact();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      while (mN > mA) {
        mA = super.next().longValueExact();
      }
      if (mN != mA) {
        return Z.valueOf(mN);
      }
    }
  }
}

