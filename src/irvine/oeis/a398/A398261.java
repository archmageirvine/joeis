package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A398261 Irregular triangular array read by rows: the first row is 1, 2. Thereafter, if the last entry of the previous row has greatest prime factor p, the next row is formed from the p smallest unused positive multiples of p.
 * @author Sean A. Irvine
 */
public class A398261 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  protected long[] mRow = {1, 2};
  private int mM = -1;

  protected void step() {
    for (final long v : mRow) {
      mUsed.set(v);
    }
    final int p = Functions.GPF.i(mRow[mRow.length - 1]);
    mRow = new long[p];
    long q = 0;
    for (int k = 0; k < mRow.length; ++k) {
      do {
        q += p;
      } while (mUsed.isSet(q));
      mRow[k] = q;
    }
    mM = 0;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      step();
    }
    return Z.valueOf(mRow[mM]);
  }
}
