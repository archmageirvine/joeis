package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397521 Expansion of ordinary generating function A(x) satisfying (A(x)^2-A(x^2))/2 = x/(1-x)^2.
 * @author Sean A. Irvine
 */
public class A397521 extends CachedSequence {

  /** Construct the sequence. */
  public A397521() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      Z t = Z.valueOf(n);
      for (long k = 1; k <= (n - 1) / 2; ++k) {
        t = t.subtract(self.a(k).multiply(self.a(n - k)));
      }
      if ((n & 1) == 0) {
        final Z h = self.a(n / 2);
        return t.add(h.multiply(Z.ONE.subtract(h)).divide2());
      }
      return t;
    });
  }
}
