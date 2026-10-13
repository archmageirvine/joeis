package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A400792 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A400792 extends Sequence0 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicLongArray mCnt = new LongDynamicLongArray();
  private final LongDynamicLongArray mCntLim = new LongDynamicLongArray();
  private long mN = -1;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        // Update the cnt value for k starting from where we previously left off
        long cnt = mCnt.get(k);
        for (long j = mCntLim.get(k); j < mN; ++j) {
          final long aj = mA.get(j);
          if (aj < k && Functions.GCD.l(aj, k) == 1) {
            ++cnt;
          } else if (aj > k && Functions.GCD.l(aj, k) > 1) {
            --cnt;
          }
        }
        mCntLim.set(k, mN);
        mCnt.set(k, cnt);
        if (cnt == 1) {
          mUsed.set(k);
          mA.set(mN, k);
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}
