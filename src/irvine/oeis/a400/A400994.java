package irvine.oeis.a400;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A400994 Numbers k such that the circulant matrix formed by their decimal digits and the one formed by the decimal digits of the sum of their divisors have the same determinant.
 * @author Sean A. Irvine
 */
public class A400994 extends FilterNumberSequence {

  private static long det(final long n) {
    final int d = Functions.DIGIT_LENGTH.i(n);
    final int[][] m = new int[d][d];
    long v = n;
    for (int k = 0; k < d; ++k) {
      final int u = (int) (v % 10);
      for (int j = 0; j < d; ++j) {
        m[j][(d - 1 + k + j) % d] = u;
      }
      v /= 10;
    }
    return IntegerUtils.det(m);
  }

  /** Construct the sequence. */
  public A400994() {
    super(1, n -> det(n) == det(Functions.SIGMA1.l(n)));
  }
}
