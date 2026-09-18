package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399401 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A399401 extends Sequence1 {

  private long mN = 0;
  private long mMin = 1;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (Functions.SIGMA0.z(mMin).compareTo(mBest) <= 0) {
      ++mMin;
    }
    while (true) {
      if (Functions.SIGMA0.z(++mN).compareTo(mBest) > 0) {
        for (long k = mMin; 2 * k <= mN; ++k) {
          if (Functions.GCD.l(k, mN) == 1 && Functions.GCD.l(k, mN - k) == 1 && Functions.SIGMA0.z(k).compareTo(mBest) > 0 && Functions.SIGMA0.z(mN - k).compareTo(mBest) > 0) {
            mBest = Functions.SIGMA0.z(k).min(Functions.SIGMA0.z(mN - k)).min(Functions.SIGMA0.z(mN));
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

