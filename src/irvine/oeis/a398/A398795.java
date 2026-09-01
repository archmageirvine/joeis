package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398795 Number of values 0 &lt;= r &lt; 2^n such that the trajectories of r and r+1 under the map f(x) = x/2 for x even, (7*x+1)/2 for x odd, satisfy f^(n)(r) = f^(n)(r+1) and contain the same number of odd terms among the first n iterates.
 * @author Sean A. Irvine
 */
public class A398795 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return n.isEven() ? n.divide2() : n.multiply(7).add(1).divide2();
  }

  @Override
  public Z next() {
    final long end = 1L << ++mN;
    long count = 0;
    for (long k = 0; k < end; ++k) {
      Z r0 = Z.valueOf(k);
      Z r1 = Z.valueOf(k + 1);
      long odd0 = k & 1;
      long odd1 = 1 - odd0;
      for (long j = 0; j < mN; ++j) {
        r0 = f(r0);
        r1 = f(r1);
        if (r0.isOdd()) {
          ++odd0;
        }
        if (r1.isOdd()) {
          ++odd1;
        }
      }
      if (r0.equals(r1) && odd0 == odd1) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
