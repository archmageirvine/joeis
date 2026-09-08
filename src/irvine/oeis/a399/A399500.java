package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399500 allocated for Rafael Andres Pastrana Tordecilla.
 * @author Sean A. Irvine
 */
public class A399500 extends Sequence1 {

  private int mM = 0;
  private long[] mRow = {};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mRow.length + 1];
      final int n = mRow.length;
      final long m = n / 2;
      if ((n & 1) == 1) {
        for (int k = 0; k < n; ++k) {
          mRow[k] = m + 1 + k;
        }
      } else {
        for (int k = 0, j = 0; k < n; ++k) {
          if (k == m) {
            ++j;
          }
          mRow[k] = m + j + k;
        }
      }
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
