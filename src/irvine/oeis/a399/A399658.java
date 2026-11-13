package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A399658 Number of jumps until the n-th return to 0 of the walk on the integers that starts at 0 and, on its j-th visit to an integer x, jumps to x - j if x &gt; 0 and to x + j if x &lt;= 0.
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

