package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A398339 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A398339 extends Sequence1 {

  private int mN = 0;
  private Z mLimit = Z.valueOf(32);
  private ArrayList<Z> mA = new ArrayList<>();

  private void extend() {
    final TreeSet<Z> v = new TreeSet<>();
    for (long x = 2; ZUtils.tetration(2, x, mLimit).compareTo(mLimit) < 0; ++x) {
      for (int y = 2; y <= x; ++y) {
        final Z s0 = ZUtils.tetration(x, y, mLimit);
        if (s0.compareTo(mLimit) >= 0) {
          break;
        }
        final Z s1 = ZUtils.tetration(y, x, mLimit);
        if (s1.compareTo(mLimit) >= 0) {
          break;
        }
        final Z sum = s0.add(s1);
        if (sum.compareTo(mLimit) >= 0) {
          break;
        }
        v.add(sum);
      }
    }
    mA = new ArrayList<>(v);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.size() <= mN) {
      extend();
      mLimit = mLimit.multiply2();
    }
    return mA.get(mN - 1);
  }
}
