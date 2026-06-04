package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396282 allocated for Sajid Hussain.
 * @author Sean A. Irvine
 */
public class A396282 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).equals(q.bitLength() - 1)) {
        return q;
      }
    }
  }
}

