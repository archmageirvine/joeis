package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400345 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A400345 extends CachedSequence {

  /** Construct the sequence. */
  public A400345() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == 1) {
        return Z.ZERO;
      }
      if ((n & 1) == 1) {
        return self.a(n / 2 + 1).subtract(self.a(n / 2));
      }
      return self.a(n - 2).add(self.a(n / 2));
    });
  }
}

