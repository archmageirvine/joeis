package irvine.oeis.a399;

import irvine.math.IntegerUtils;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399946.
 * @author Sean A. Irvine
 */
public class A399939 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A399939() {
    super(0);
  }

  private int[] b(final int[] a) {
    final int[] b = new int[a.length];
    for (int k = 0; k < a.length; ++k) {
      b[k] = a[k] + 1;
    }
    return b;
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
      //System.out.println("pos=" + pos + " len=" + len + " " + RING.det(m) + " " + m + " " + Arrays.toString(b(p)));
      if (IntegerUtils.det(m) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 2) {
      return true;
    }
    return check(p, pos);
  }
}
