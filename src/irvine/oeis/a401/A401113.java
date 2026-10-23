package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401113 Primes p at which the running sum Sum_{q prime &lt;= p} Kronecker(5,q) sets a new record high.
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
