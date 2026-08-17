package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397704 allocated for Jiawei Tang.
 * @author Sean A. Irvine
 */
public class A397704 extends CachedSequence {

  /** Construct the sequence. */
  public A397704() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      long m = n;
      long k = 0;
      Z sum = Z.ONE;
      while (m != 0) {
        if ((m & 1) == 1) {
          sum = sum.add(self.a(k));
        }
        ++k;
        m >>>= 1;
      }
      return sum;
    });
  }
}
