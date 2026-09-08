package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399262 Triangle read by rows: row n gives the n consecutive integers centered at n^2, excluding n^2 if n is even.
 * @author Sean A. Irvine
 */
public class A399262 extends Sequence1 {

  private int mM = 0;
  private long[] mRow = {};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mRow.length + 1];
      final int n = mRow.length;
      final long c = (long) n * n;
      final long m = n / 2;
      if ((n & 1) == 1) {
        for (int k = 0; k < n; ++k) {
          mRow[k] = c - m + k;
        }
      } else {
        for (int k = 0, j = 0; k < n; ++k) {
          if (k == m) {
            ++j;
          }
          mRow[k] = c - m + j + k;
        }
      }
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
