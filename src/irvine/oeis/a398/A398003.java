package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A398003 Sum of excess shadings of all permutations of [n] using a special circular shading.
 * @author Sean A. Irvine
 */
public class A398003 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A398003() {
    super(0);
  }

  @Override
  protected long count(final int[] p) {
    // Compute shading
    final int n = p.length;
    final int[] c = new int[n];
    for (int k = 0; k < n; ++k) {
      for (int j = 0, i = k, d = ((k & 1) << 1) - 1; j <= p[k]; ++j) {
        ++c[i];
        i += d;
        if (i >= n) {
          i = 0;
        } else if (i < 0) {
          i = n - 1;
        }
      }
    }
    // Compute excess shadings
    final int min = Functions.MIN.i(c);
    return n * (n + 1) / 2 - n * min;
  }
}
