package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397441 a(n) is the number of partitions of n into parts of the form 2^r*(2^s - 1) with each r distinct.
 * @author Sean A. Irvine
 */
public class A397441 extends CachedSequence {

  /** Construct the sequence. */
  public A397441() {
    super(0, Long.class, (self, n) -> {
      if (n < 3) {
        return Z.ONE;
      }
      if ((n & 1) == 0) {
        return self.a(n / 2);
      }
      Z sum = Z.ZERO;
      long m = n / 2;
      long k = 1;
      while (m - k + 1 >= 0) {
        sum = sum.add(self.a(m - k + 1));
        k <<= 1;
      }
      return sum;
    });
  }
}

