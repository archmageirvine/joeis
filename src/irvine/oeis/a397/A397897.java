package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397897 a(n) = Sum_{j=1..n} (-1)^(j+1) * j * prime(n-j+1).
 * @author Sean A. Irvine
 */
public class A397897 extends A000040 {

  private Z mA = null;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = super.next().subtract(mB.multiply2()).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
