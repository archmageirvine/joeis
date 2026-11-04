package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a008.A008479;

/**
 * A401480 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A401480 extends A000040 {

  private final DirectSequence mA = new A008479();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z p = super.next();
      Z q = p;
      Z k = p;
      while (true) {
        k = k.multiply(q);
        if (k.isZero()) {
          break;
        }
        if (mA.a(k).equals(mN)) {
          return k;
        }
        q = mPrime.prevPrime(q);
      }
    }
  }
}

