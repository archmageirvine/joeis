package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401531.
 * @author Sean A. Irvine
 */
public class A400690 extends A000040 {

  private Z mStart = super.next();

  @Override
  public Z next() {
    Z p = mStart;
    while (true) {
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).compareTo(Z.EIGHT) > 0) {
        final Z res = p.subtract(mStart);
        mStart = q;
        return res;
      }
      p = q;
    }
  }
}
