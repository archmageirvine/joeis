package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a235.A235154;

/**
 * A398258 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A398258 extends A235154 {

  private Z mT = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mT = mT.multiply(10);
    long cnt = 0;
    while (mA.compareTo(mT) < 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
