package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400959 allocated for Henri Lifchitz.
 * @author Sean A. Irvine
 */
public class A400959 extends Sequence1 {

  private long mSum = 0;
  private long mN = 1;
  private long mLim = 1;

  @Override
  public Z next() {
    while (mN <= mLim) {
      mSum += Functions.LIOUVILLE_LAMBDA.i(Z.valueOf(mN).multiply(++mN));
    }
    mLim *= 10;
    return Z.valueOf(mSum);
  }
}

