package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A402275 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A402275 extends A000040 {

  private Z mStart = super.next();

  @Override
  public Z next() {
    Z p = mStart;
    while (true) {
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).compareTo(Z.TEN) > 0) {
        final Z res = p.subtract(mStart);
        mStart = q;
        return res;
      }
      p = q;
    }
  }
}
