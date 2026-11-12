package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A399658 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399658 extends Sequence1 {

  private long mPos = 0;
  private long mJumps = 0;
  private final LongDynamicIntArray mCountsPos = new LongDynamicIntArray();
  {
    mCountsPos.increment(0);
  }

  // Fit positive and negative in one array
  private long m(final long pos) {
    return 2 * Math.abs(pos) + (pos < 0 ? 1 : 0);
  }

  @Override
  public Z next() {
    do {
      ++mJumps;
      final long j = mCountsPos.get(m(mPos));
      if (mPos > 0) {
        mPos -= j;
      } else {
        mPos += j;
      }
      mCountsPos.increment(m(mPos));
    } while (mPos != 0);
    return Z.valueOf(mJumps);
  }
}

