package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398259 a(1)=0; for n&gt;=2, let s = digit sum of a(n-1); if s=a(m) for some m &lt; n-1, let m be the greatest such index and set a(n)=n-1-m; otherwise set a(n) = 0.
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
