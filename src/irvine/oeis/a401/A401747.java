package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A401747 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A401747 extends Sequence1 {

  private long mPos = 0;
  private long mJumps = 0;
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  {
    mCounts.increment(0);
  }

  @Override
  public Z next() {
    do {
      ++mJumps;
      final long j = mCounts.get(mPos);
      if (j <= mPos) {
        mPos -= j;
      } else {
        mPos = j - mPos - 1;
      }
      mCounts.increment(mPos);
    } while (mPos != 0);
    return Z.valueOf(mJumps);
  }
}

