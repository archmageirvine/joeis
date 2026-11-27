package irvine.oeis.a402;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402223 Fill the cells of the square grid in spiral order, starting at the center. a(n) is the smallest positive k such that no earlier cell within k steps (up, down, left, right) of cell n has k.
 * @author Sean A. Irvine
 */
public class A402223 extends Sequence1 {

  // After Connor Harrington

  private final Map<Long, Integer> mCol = new HashMap<>();

  private int mX = 0;
  private int mY = 0;
  private int mDx = 1;
  private int mDy = 0;
  private int mSeg = 1;
  private int mPos = 0;
  private int mTurns = 0;

  private long key(final int x, final int y) {
    return ((long) x << 32) | (y & 0xffffffffL);
  }

  @Override
  public Z next() {
    int k = 1;
    while (true) {
      boolean found = false;
      for (int i = -k; i <= k && !found; ++i) {
        final int jMin = Math.abs(i) - k;
        final int jMax = k - Math.abs(i);
        for (int j = jMin; j <= jMax; ++j) {
          final Integer value = mCol.get(key(mX + i, mY + j));
          if (value != null && value == k) {
            found = true;
            break;
          }
        }
      }
      if (!found) {
        break;
      }
      ++k;
    }
    mCol.put(key(mX, mY), k);
    // Advance along the square spiral.
    mX += mDx;
    mY += mDy;
    ++mPos;
    if (mPos == mSeg) {
      mPos = 0;
      final int tmp = mDx;
      mDx = -mDy;
      mDy = tmp;
      ++mTurns;
      if (mTurns == 2) {
        mTurns = 0;
        ++mSeg;
      }
    }
    return Z.valueOf(k);
  }
}
