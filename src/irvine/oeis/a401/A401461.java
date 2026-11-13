
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401461 Number of fixed points under iteration of the function: 1+sum of squares of base n digits.
 * @author Sean A. Irvine
 */
public class A401461 extends Sequence2 {

  private long mN = 1;

  private static long step(final long x, final long base) {
    return 1 + Functions.DIGIT_SUM_SQUARES.l(base, x);
  }

  @Override
  public Z next() {
    final long n = ++mN;
    final long limit = 1 + 3 * (n - 1) * (n - 1);
    long fixedPoints = 0;
    for (long start = 0; start <= limit; ++start) {
      if (step(start, n) == start) {
        ++fixedPoints;
      }
    }
    return Z.valueOf(fixedPoints);
  }
}
