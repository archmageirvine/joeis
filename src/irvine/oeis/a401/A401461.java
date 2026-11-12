
package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401461 allocated for Helen Grundman.
 * @author Sean A. Irvine
 */
public class A401461 extends Sequence2 {

  private long mN = 1;

  private static long step(long x, final long base) {
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
