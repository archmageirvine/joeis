package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A398332 Largest value M such that all integers 1 through M can be expressed as b_i, b_i + b_j, or b_j - b_i for some set of n positive integers (the 2-postage stamp problem with subtraction).
 * @author Sean A. Irvine
 */
public class A398332 extends Sequence1 {

  private int mN = 0;
  private int mBest = 0;

  private void search(final int[] b, final int pos, final DynamicIntArray representations) {
    if (pos >= b.length) {
      int k = 1;
      while (representations.get(k) > 0) {
        ++k;
      }
      --k;
      if (k > mBest) {
        mBest = k;
      }
      return;
    }
    int j = pos == 0 ? 1 : b[pos - 1] + 1;
    while (j + mN - pos - 1 <= mN * (mN + 1L)) {
      b[pos] = j;
      representations.increment(j);
      for (int i = 0; i <= pos; ++i) {
        representations.increment(b[i] + j);
        representations.increment(j - b[i]);
      }
      search(b, pos + 1, representations);
      for (int i = 0; i <= pos; ++i) {
        representations.add(b[i] + j, -1);
        representations.add(j - b[i], -1);
      }
      representations.add(j, -1);
      ++j;
    }
  }

  @Override
  public Z next() {
    mBest = 0;
    final int[] v = new int[++mN];
    search(v, 0, new DynamicIntArray());
    return Z.valueOf(mBest);
  }
}
