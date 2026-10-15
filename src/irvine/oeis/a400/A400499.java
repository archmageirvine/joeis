package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400499 allocated for Dieter Renz.
 * @author Sean
 */
public class A400499 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400499() {
    super(1, r -> {
      final long diameter = 2 * r;
      for (long a = 1; a < diameter; ++a) {
        for (long b = a + 1; b < diameter; ++b) {
          for (long c = b + 1; c < diameter; ++c) {
            final long midD = c + 1;
            final long maxD = Math.min(diameter, a + b + c);
            for (long d = midD; d < maxD; ++d) {
              final long s = a + b + c + d;
              final long areaSquared = (s - 2 * a) * (s - 2 * b) * (s - 2 * c) * (s - 2 * d);
              if (areaSquared <= 0) {
                continue;
              }
              final Z numR = Z.valueOf(a * b + c * d).multiply(a * c + b * d).multiply(a * d + b * c);
              if (numR.equals(Z.valueOf(r).square().multiply(areaSquared))) {
                return true;
              }
            }
          }
        }
      }
      return false;
    });
  }
}
