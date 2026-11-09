package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A401334 Multi-arch perturbed Hofstadter Q-sequence: a(n) = a(n-a(n-1)) + a(n-a(n-2)) - (-1)^n for n &gt;= 8, with (a(1),...,a(7)) = (1,1,3,3,3,3,5).
 * @author Sean A. Irvine
 */
public class A401334 extends CachedSequence {

  /** Construct the sequence. */
  public A401334() {
    super(1, Long.class, (self, n) -> {
      if (n <= 7) {
        if (n <= 2) {
          return Z.ONE;
        }
        if (n == 7) {
          return Z.FIVE;
        }
        return Z.THREE;
      }
      return self.a(n - self.a(n - 1).longValueExact()).add(self.a(n - self.a(n - 2).longValueExact())).subtract(Z.NEG_ONE.pow(n));
    });
  }
}

