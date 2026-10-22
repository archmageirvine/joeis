package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401113 allocated for Ved Prakash Pandey.
 * @author Sean A. Irvine
 */
public class A401113 extends A000040 {

  private long mSum = 0;
  private long mRecord = Long.MIN_VALUE;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long k = Functions.KRONECKER.l(5, p);
      mSum += k;
      if (mSum > mRecord) {
        mRecord = mSum;
        return p;
      }
    }
  }
}
