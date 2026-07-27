package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A398095 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398095 extends A398094 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private int mN = 0;
  private int mR = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mR;
      computeRow();
      for (int k = 0; k < mRow.length; ++k) {
        if (!mRow[k].isZero() && mFirsts.get(k + 1) == 0) {
          mFirsts.set(k + 1, mR);
          if (mVerbose) {
            StringUtils.message("Solution for " + (k + 1) + " is " + mR);
          }
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
