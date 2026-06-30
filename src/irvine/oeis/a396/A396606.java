package irvine.oeis.a396;

import java.util.HashMap;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396606 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A396606 extends Sequence1 {

  // After Arkadeep Dutta

  private int mN = 0;
  private long mM;
  private HashMap<Long, Z> mMemo;

  private Z dfs(final int v, final long used) {
    final long key = (used << 3) | v;
    final Z res = mMemo.get(key);
    if (res != null) {
      return res;
    }

    Z sum = Z.ZERO;
    final int base = v * (int) mM;
    for (int u = 0; u < mM; ++u) {
      final int e = base + u;
      if (((used >>> e) & 1L) != 0) {
        sum = sum.add(1);
      } else {
        sum = sum.add(dfs(u, used | (1L << e)));
      }
    }

    mMemo.put(key, sum);
    return sum;
  }

  private final MemoryFunction1<Z> mEcw = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int mm) {
      mM = mm;
      mMemo = new HashMap<>();
      Z sum = Z.ZERO;
      for (int v = 0; v < mM; ++v) {
        for (int u = 0; u < mM; ++u) {
          sum = sum.add(dfs(u, 1L << (v * (int) mM + u)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN > 8) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final Z t = mEcw.get(k).divide(k).multiply(Binomial.binomial(mN - 1, k - 1));
      sum = sum.signedAdd(((mN - k) & 1) == 0, t);
    }
    return sum;
  }
}
