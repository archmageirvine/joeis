package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401011 allocated for Francisco J. Mu\u00f1oz.
 * @author Sean A. Irvine
 */
public class A401011 extends Sequence1 {

  private int mN = 0;
  private List<Z> mRow = new ArrayList<>();
  private int mPos = 0;
  private boolean[] mVisited;
  private Z[] mPowers;
  private int mSize;
  private int mMask;

  private void dfs(final int x, final int depth, final Z value) {
    if (depth == mSize) {
      for (int b = 0; b <= 1; ++b) {
        if ((((x << 1) | b) & mMask) != 0) {
          continue;
        }
        mRow.add(b == 0 ? value : value.add(mPowers[x]));
      }
      return;
    }
    for (int b = 0; b <= 1; ++b) {
      final int y = ((x << 1) | b) & mMask;
      if (!mVisited[y]) {
        mVisited[y] = true;
        dfs(y, depth + 1, b == 0 ? value : value.add(mPowers[x]));
        mVisited[y] = false;
      }
    }
  }

  private void nextRow() {
    ++mN;
    if (mN >= 31) {
      throw new UnsupportedOperationException();
    }
    mSize = 1 << mN;
    mMask = mSize - 1;
    mVisited = new boolean[mSize];
    mPowers = new Z[mSize];
    for (int k = 0; k < mSize; ++k) {
      mPowers[k] = Z.ONE.shiftLeft(k);
    }
    mVisited[0] = true;
    mRow = new ArrayList<>();
    dfs(0, 1, Z.ZERO);
    Collections.sort(mRow);
    mPos = 0;
  }

  @Override
  public Z next() {
    if (mPos >= mRow.size()) {
      nextRow();
    }
    return mRow.get(mPos++);
  }
}
