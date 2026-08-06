package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A398261 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A398261 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long[] mRow = {1, 2};
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
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
    mUsed.set(mRow[mM]);
    return Z.valueOf(mRow[mM]);
  }
}
