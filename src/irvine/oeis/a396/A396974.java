package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence0;

/**
 * A399108 allocated for Brian Klemm.
 * @author Sean A. Irvine
 */
public class A396974 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Z[] mCounts = {};
  private Object[] mLocks = null; // Used for safe parallelism

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
      mCounts = new Z[mN * mN / 4 + 1];
      mLocks = new Object[mCounts.length];
      for (int k = 0; k < mLocks.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      new ParallelGenerateGraphsSequence(mN - 1, mN - 1, GenerateGraphs.TRIANGLE_FREE, () -> g -> {
        final Z v = Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g));
        synchronized (mLocks[g.size()]) {
          mCounts[g.size()] = mCounts[g.size()].add(v);
        }
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(0);
          gg.setMaxEdges(mN * (mN - 1) / 2);
          gg.setConnectionLevel(0);
        }
      }.next();
    }
    return mCounts[mM];
  }

}
