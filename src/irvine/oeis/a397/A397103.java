package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085470.
 * @author Sean A. Irvine
 */
public class A397103 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    long k = 0;
    while (!mA.multiply(++k).add(1).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
