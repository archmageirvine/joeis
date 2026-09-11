package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A396700 allocated for \u00d2scar P\u00e9rez Massanet.
 * @author Sean A. Irvine
 */
public class A396700 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396700() {
    super(1, 2, k -> {
      for (long x = 1; x <= Functions.SQRT.l(k - 1) + 1; ++x) {
        final Z kxx = Z.valueOf(x).square().multiply(k);
        final Z[] d = kxx.multiply(4).subtract(4 * x - 1).sqrtAndRemainder();
        if (d[1].isZero()) {
          final Z num = d[0].subtract(2 * x - 1);
          if (num.isOdd()) {
            continue;
          }
          final Z c = num.divide2();
          if (c.compareTo(Z.ONE) >= 0 && c.compareTo(k) < 0 && kxx.add(c).equals(c.add(x).square())) {
            return true;
          }
        }
      }
      return false;
    });
  }
}
