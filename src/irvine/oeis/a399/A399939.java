package irvine.oeis.a399;

import irvine.math.IntegerUtils;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399939 allocated for Pontus von Br\u00f6mssen.
 * @author Sean A. Irvine
 */
public class A399939 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A399939() {
    super(0);
  }

  private boolean check(final int[] p, final int pos) {
    for (int len = 2; 2 * len - 2 < pos; ++len) {
      final int[][] m = new int[len][len];
      for (int k = 0; k < len; ++k) {
        for (int j = 0; j < len; ++j) {
          final int v = p[pos - 2 * len + 1 + k + j] + 1;
          m[k][j] = v;
        }
      }
      if (IntegerUtils.det(m) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    return pos <= 2 || check(p, pos);
  }
}
