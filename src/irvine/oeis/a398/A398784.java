package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A398784 allocated for G\u00f6ktu\u011f Omay.
 * @author Sean A. Irvine
 */
public class A398784 extends Sequence1 {

  // After G&ouml;ktu&#x11F; Omay

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private int mN = 0;

  private void augment(final int s, final int[] p) {
    final int n = p.length;
    p[0] = -(s + (n > 2 ? (n - 3) * p[n - 1] : 0));
    if (n >= 3) {
      final int q = 2 * p[n - 2] - p[n - 1];
      boolean tog = false;
      for (int k = 1; k < n; ++k) {
        tog = !tog;
        if (tog && p[k] > q) {
          p[k] -= q;
        } else {
          p[k] = 0;
        }
      }
    }
    final int z = -Functions.SUM.i(p);
    if (z > 0) {
      mCounts.increment(z);
    }
  }

  private void augment(final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      augment(n, p);
    }
  }

  @Override
  public Z next() {
    ++mN;
    augment(2 * mN - 1);
    augment(2 * mN);
    return Z.valueOf(mCounts.get(mN));
  }
}
