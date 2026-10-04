package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a000.A000058;

/**
 * A400352 Least integer m &gt; 1 that does not occur as a denominator in any representation of 1 as a sum of n distinct unit fractions.
 * @author Sean A. Irvine
 */
public class A400352 extends Sequence3 {

  private int mN = 2;
  private final HashSet<Long> mSeen = new HashSet<>();
  private Z[] mLimits = null;

  private void search(final Q sum, final Z prev, final int k, final ArrayList<Long> used) {
    if (sum.compareTo(Q.ONE) >= 0) {
      return; // Already too big
    }
    if (k == mLimits.length - 1) {
      final Q last = Q.ONE.subtract(sum);
      if (last.num().isOne() && last.den().compareTo(prev) > 0 && last.den().compareTo(mLimits[k]) <= 0) {
        mSeen.addAll(used);
      }
      return;
    }
    for (Z xk = prev.add(1); xk.compareTo(mLimits[k]) <= 0; xk = xk.add(1)) {
      if (xk.bitLength() < Long.SIZE) {
        used.add(xk.longValue());
      }
      search(sum.add(new Q(Z.ONE, xk)), xk, k + 1, used);
      used.remove(used.size() - 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSeen.clear();
    final Sequence limitSeq = new A000058();
    mLimits = new Z[mN];
    for (int k = 0; k < mLimits.length; ++k) {
      mLimits[k] = limitSeq.next().subtract(1).multiply(mN - k);
    }
    search(Q.ZERO, Z.ZERO, 0, new ArrayList<>());
    mSeen.add(0L);
    mSeen.add(1L);
    return Z.valueOf(LongUtils.mex(mSeen));
  }
}
