package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400887 allocated for Rok Cestnik.
 * @author Sean A. Irvine
 */
public class A400887 extends CachedSequence {

  /** Construct the sequence. */
  public A400887() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      return self.a(n - 1 - self.a(self.a(n - 1).longValueExact()).square().longValueExact()).add(1);
    });
  }
}
