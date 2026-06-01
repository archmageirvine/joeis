package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A396488 Number of labeled histories for rooted at-most-4-furcating trees with n leaves, if simultaneous branching events are allowed.
 * @author Sean A. Irvine
 */
public class A396488 extends CachedSequence {

  private static final Z Z24 = Z.valueOf(24);

  /** Construct the sequence. */
  public A396488() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long x2 = 0; x2 <= n / 2; ++x2) {
        final Z z2 = Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(x2).shiftLeft(x2));
        for (long x3 = 0; x3 <= (n - 2 * x2) / 3; ++x3) {
          final Z z3 = z2.divide(Functions.FACTORIAL.z(x3).multiply(Z.SIX.pow(x3)));
          for (long x4 = Math.max((5 - 2 * x2 - 3 * x3) / 4, 0); x4 <= (n - 2 * x2 - 3 * x3) / 4; ++x4) {
            final Z s = z3.divide(Functions.FACTORIAL.z(x4).multiply(Z24.pow(x4)))
              .multiply(self.a(n - x2 - 2 * x3 - 3 * x4))
              .divide(Functions.FACTORIAL.z(n - 2 * x2 - 3 * x3 - 4 * x4));
            sum = sum.add(s);
          }
        }
      }
      return sum;
    });
  }
}
