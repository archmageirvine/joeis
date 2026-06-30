package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396659 allocated for Arkadeep Dutta.
 * @author Sean A. Irvine
 */
public class A396659 extends Sequence1 {

  // After Arkadeep Dutta

  private int mN = 0;
  private int mM = 1;
  private long[] mDist;
  private int mAllVisited;

  private void dfs(final int v, final long used, final int vis, final int d) {
    final int base = v * mN;
    for (int u = 0; u < mN; ++u) {
      final int e = base + u;
      final int nv = vis | (1 << u);
      if (((used >>> e) & 1L) != 0) {
        if (nv == mAllVisited) {
          ++mDist[d + 1];
        }
      } else {
        dfs(u, used | (1L << e), nv, d + 1);
      }
    }
  }

  private void buildRow() {
    mDist = new long[mN * mN + 2];
    mAllVisited = (1 << mN) - 1;
    for (int u = 0; u < mN; ++u) {
      dfs(u, 1L << u, 1 | (1 << u), 1);
    }
  }

  @Override
  public Z next() {
    if (++mM > mN * mN + 1) {
      ++mN;
      mM = mN + 1;
      buildRow();
    }
    return Z.valueOf(mDist[mM]);
  }
}
