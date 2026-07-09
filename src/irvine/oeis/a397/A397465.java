package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397465 allocated for James S. DeArmon.
 * @author Sean A. Irvine
 */
public class A397465 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    if (mT.equals(Z.TEN)) {
      return Z.valueOf(13);
    }
    Z p = mT;
    while (true) {
      p = Functions.NEXT_PRIME.z(p);
      if (p.divide(10).isProbablePrime()) {
        return p;
      }
    }
  }
}
