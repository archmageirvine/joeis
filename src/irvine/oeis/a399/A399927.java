package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399927 Sequence constructed by concatenating recursively defined parts.
 * @author Sean A. Irvine
 */
public class A399927 extends Sequence1 {

  // After Hendrik Untch

  private final List<List<Integer>> mParts = new ArrayList<>();
  private int mBlock = 2;
  private int mPos = -1;
  private List<Integer> mCurrent = new ArrayList<>();
  private boolean mFirst = true;

  /** Construct the sequence. */
  public A399927() {
    mParts.add(new ArrayList<>(List.of(1, 1)));
    mParts.add(new ArrayList<>(List.of(1)));
    mParts.add(new ArrayList<>(List.of(1, 1)));
  }

  private void extendParts(final int i) {
    while (mParts.size() < i) {
      final int j = mParts.size() - 1;
      final int k = Functions.TRINV.i(j);
      final int a = 2 + k * (k - 1) / 2;
      final int b = k + j - k * (k + 1) / 2;
      final int middle = Math.min(a, b);
      final List<Integer> part = new ArrayList<>(mParts.get(a - 1));
      part.add(middle);
      part.addAll(mParts.get(b - 1));
      mParts.add(part);
    }
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    if (mPos < 0 || mPos >= mCurrent.size()) {
      extendParts(mBlock);
      mCurrent = new ArrayList<>();
      mCurrent.add(mBlock);
      mCurrent.addAll(mParts.get(mBlock - 1));
      ++mBlock;
      mPos = 0;
    }
    return Z.valueOf(mCurrent.get(mPos++));
  }
}
