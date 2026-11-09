package irvine.oeis.a401;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401459 Number of attractors under iteration of the function S(x) = n+sum of squares of digits of x.
 * @author Sean A. Irvine
 */
public class A401459 extends Sequence0 {

  private long mN = -1;

  /*
   * Checks whether x eventually returns to itself under S_n(x) = n + sum_of_squares(x).
   */
  private static boolean isPeriodicPoint(final long startX, final long n) {
    final Set<Long> visited = new HashSet<>();
    long current = startX;

    while (true) {
      if (current == startX && !visited.isEmpty()) {
        return true; // Returned to startX -> startX is part of a cycle/attractor
      }
      if (visited.contains(current)) {
        return false; // Trajectory entered a cycle that does NOT include startX
      }
      visited.add(current);
      current = n + Functions.DIGIT_SUM_SQUARES.l(current);
    }
  }

  @Override
  public Z next() {
    ++mN;
    // Determine maximum digit length kMax: 10^(k-1) <= n + 81*k
    int kMax = 1;
    long pow10 = 1; // 10^(kMax-1)
    while (true) {
      if (pow10 > mN + 81L * kMax) {
        break;
      }
      if (++kMax > 18) {
        kMax = 18;
        break;
      }
      pow10 *= 10;
    }
    kMax--;

    // Bounding limits for candidate x:
    final long startX = Math.max(1L, mN);
    final long upperLimit = mN + 81L * kMax;
    long count = 0;
    // Test each candidate x in the bounded window to check if it belongs to a cycle
    for (long x = startX; x <= upperLimit; ++x) {
      if (isPeriodicPoint(x, mN)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
