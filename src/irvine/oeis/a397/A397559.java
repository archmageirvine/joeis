package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.BitSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397559 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A397559 extends Sequence1 {

  private int mN = 0;
  private Z[] mBinomial;
  private Z[] mPrefix;
  private final ArrayList<BitSet> mSolutions = new ArrayList<>();

  private void search(final int k, final Z u, final Z v, final int used, final BitSet x) {
    final Z d = u.subtract(v);
    if (d.isZero() && used >= 2) {
      for (final BitSet s : mSolutions) {
        final BitSet t = (BitSet) s.clone();
        t.andNot(x);
        if (t.isEmpty()) {
          return;
        }
      }
      mSolutions.add((BitSet) x.clone());
      return;
    }
    if (k < 0) {
      return;
    }
    if (d.abs().compareTo(mPrefix[k]) > 0) {
      return;
    }

    // Ignore this coefficient.
    search(k - 1, u, v, used, x);

    // Use this coefficient.
    x.set(k);
    if (used == 0) {
      search(k - 1, u.add(mBinomial[k]), v, 1, x);
    } else {
      search(k - 1, u.add(mBinomial[k]), v, used + 1, x);
      search(k - 1, u, v.add(mBinomial[k]), used + 1, x);
    }
    x.clear(k);
  }

  @Override
  public Z next() {
    ++mN;
    final int m = (mN - 1) / 2;
    mBinomial = new Z[m + 1];
    mPrefix = new Z[m + 1];
    Z sum = Z.ZERO;
    for (int k = 0; k <= m; ++k) {
      mBinomial[k] = Binomial.binomial(mN, k);
      sum = sum.add(mBinomial[k]);
      mPrefix[k] = sum;
    }

    mSolutions.clear();
    search(m, Z.ZERO, Z.ZERO, 0, new BitSet());
    return Z.valueOf(mSolutions.size());
  }
}
