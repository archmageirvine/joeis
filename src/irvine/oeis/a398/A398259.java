package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398259 allocated for Bence Bern\u00e1th.
 * @author Sean A. Irvine
 */
public class A398259 extends CachedSequence {

  /** Construct the sequence. */
  public A398259() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      final Z prod = Functions.DIGIT_SUM.z(self.a(n - 1));
      for (long m = n - 2; m > 0; --m) {
        if (prod.equals(self.a(m))) {
          return Z.valueOf(n - 1 - m);
        }
      }
      return Z.ZERO;
    });
  }
}
