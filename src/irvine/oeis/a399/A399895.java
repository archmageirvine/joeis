package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399895 allocated for Marco Mantovanelli.
 * @author Sean A. Irvine
 */
public class A399895 extends CachedSequence {

  /** Construct the sequence. */
  public A399895() {
    super(1, Long.class, (self, n) -> {
      if (n <= 2 || n == 6) {
        return Z.ONE;
      }
      if (n <= 4) {
        return Z.THREE;
      }
      if (n == 5) {
        return Z.FIVE;
      }
      return self.a(n - self.a(n - 3).longValueExact()).add(self.a(n - self.a(n - 6).longValueExact())).subtract(Z.NEG_ONE.pow(n));
    });
  }
}

