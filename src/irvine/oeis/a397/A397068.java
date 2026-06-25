package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397068 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A397068 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      Z q = p;
      Z sum = p;
      for (long k = 1; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        sum = sum.add(q);
      }
      if (sum.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
