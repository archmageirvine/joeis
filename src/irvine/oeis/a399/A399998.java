package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399998 a(n+1) = a(n-a(a(n))^2) + 1, a(0) = 0.
 * @author Sean A. Irvine
 */
public class A399998 extends CachedSequence {

  /** Construct the sequence. */
  public A399998() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      return self.a(n - 1 - self.a(self.a(n - 1).longValueExact()).square().longValueExact()).add(1);
    });
  }
}
