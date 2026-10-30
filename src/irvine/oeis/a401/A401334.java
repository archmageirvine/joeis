package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A401334 allocated for Marco Mantovanelli.
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

