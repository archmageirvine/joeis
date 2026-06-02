package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A396535 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A396535 extends CachedSequence {

  private static final Z Z24 = Z.valueOf(24);
  private static final Z Z120 = Z.valueOf(120);
  private static final Z Z720 = Z.valueOf(720);

  /** Construct the sequence. */
  public A396535() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long x2 = 0; x2 <= n / 2; ++x2) {
        final Z z2 = Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(x2).shiftLeft(x2));
        for (long x3 = 0; x3 <= (n - 2 * x2) / 3; ++x3) {
          final Z z3 = z2.divide(Functions.FACTORIAL.z(x3).multiply(Z.SIX.pow(x3)));
          for (long x4 = 0; x4 <= (n - 2 * x2 - 3 * x3) / 4; ++x4) {
            final Z z4 = z3.divide(Functions.FACTORIAL.z(x4).multiply(Z24.pow(x4)));
            for (long x5 = 0; x5 <= (n - 2 * x2 - 3 * x3 - 4 * x4) / 5; ++x5) {
              final Z z5 = z4.divide(Functions.FACTORIAL.z(x5).multiply(Z120.pow(x5)));
              for (long x6 = Math.max((7 - 2 * x2 - 3 * x3 - 4 * x4 - 5 * x5) / 6, 0); x6 <= (n - 2 * x2 - 3 * x3 - 4 * x4 - 5 * x5) / 6; ++x6) {
                final Z s = z5.divide(Functions.FACTORIAL.z(x6).multiply(Z720.pow(x6)))
                  .multiply(self.a(n - x2 - 2 * x3 - 3 * x4 - 4 * x5 - 5 * x6))
                  .divide(Functions.FACTORIAL.z(n - 2 * x2 - 3 * x3 - 4 * x4 - 5 * x5 - 6 * x6));
                sum = sum.add(s);
              }
            }
          }
        }
      }
      return sum;
    });
  }
}
