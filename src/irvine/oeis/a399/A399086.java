package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399086 Triangle read by rows: T(n,k) is the number of ordered outcomes with product k when two independent fair n-sided dice, each with faces 0,...,n-1, are rolled, for 0 &lt;= k &lt;= (n-1)^2.
 * @author Sean A. Irvine
 */
public class A399086 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long[] mRow = {};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = new long[mN * mN + 1];
      ++mN;
      for (int k = 0; k < mN; ++k) {
        for (int j = 0; j < mN; ++j) {
          ++mRow[k * j];
        }
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}
