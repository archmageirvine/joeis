package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401458 Number of fixed points of S(x) = n + sum of squares of digits of x.
 * @author Sean A. Irvine
 */
public class A401458 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Determine maximum digit length kMax: 10^(k-1) <= n + 81*k
    int kMax = 1;
    long pow10 = 1;
    while (true) {
      if (pow10 > mN + 81L * kMax) {
        break;
      }
      if (++kMax > 18) { // Safeguard against 64-bit integer overflow
        kMax = 18;
        break;
      }
      pow10 *= 10;
    }
    --kMax;

    // Bounding limits for x:
    // Since x = n + sum(d_i^2) and sum(d_i^2) >= 0, we always have x >= n.
    // The upper bound is x <= n + 81 * kMax.
    final long startX = Math.max(1L, mN);
    final long upperLimit = mN + 81L * kMax;
    long count = 0;
    // Direct verification over the tightly bounded window
    for (long x = startX; x <= upperLimit; ++x) {
      if (Functions.DIGIT_SUM_SQUARES.l(x) == x - mN) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
