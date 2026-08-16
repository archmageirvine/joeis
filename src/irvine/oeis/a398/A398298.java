package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398298 Irregular triangle read by rows, where row n lists the numbers whose binary representation forms a valid row/column on a 2*n X 2*n Takuzu board.
 * @author Sean A. Irvine
 */
public class A398298 extends Sequence1 {

  private int mN = 0;
  private long mLim = 0;
  private long mM = 1;

  private boolean is(long m) {
    for (int k = 2; k < 2 * mN; ++k, m >>>= 1) {
      if ((m & 7) == 0 || (m & 7) == 7) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mM = Functions.SWIZZLE.l(mM);
      if (mM >= mLim) {
        mLim = 1L << (2 * ++mN);
        mM = (1L << mN) - 1;
      }
      if (is(mM)) {
        return Z.valueOf(mM);
      }
    }
  }
}

