package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence0;

/**
 * A396364 allocated for Banri Ogawa.
 * @author Sean A. Irvine
 */
public class A396364 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Z[] mCounts = null;
  private Object[] mLocks = null; // Used for safe parallelism

  private static int countTriangles(final Graph g) {
    int cnt = 0;
    for (int u = 0; u < g.order(); ++u) {
      for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
        for (int w = g.nextVertex(v, v); w >= 0; w = g.nextVertex(v, w)) {
          if (g.isAdjacent(u, w)) {
            ++cnt;
          }
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM > Functions.BINOMIAL.i(mN, 3)) {
      ++mN;
      mM = 0;
      mCounts = new Z[Functions.BINOMIAL.i(mN, 3) + 1];
      mLocks = new Object[mCounts.length];
      for (int k = 0; k < mLocks.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      new ParallelGenerateGraphsSequence(mN - 1, mN - 1, 0, () -> g -> {
        for (int u = 0; u < g.order(); ++u) {
          for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
            // Check (u,v) is in a triangle
            boolean ok = false;
            for (int w = g.nextVertex(v, -1); w >= 0; w = g.nextVertex(v, w)) {
              if (g.isAdjacent(w, u)) {
                ok = true;
                break;
              }
            }
            if (!ok) {
              return 0;
            }
          }
        }
        final int t = countTriangles(g);
        synchronized (mLocks[t]) {
          mCounts[t] = mCounts[t].add(1);
        }
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(mN - 1);
          gg.setMaxEdges(mN * (mN - 1) / 2);
          gg.setMinDeg(Math.min(2, mN));
          gg.setConnectionLevel(1);
        }
      }.next();
    }
    return mCounts[mM];
  }
}
