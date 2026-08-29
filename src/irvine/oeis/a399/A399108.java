package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A399108 Irregular triangle read by rows: T(n,k) is the number of labeled K_4-free graphs on n nodes with exactly k edges, 0 &lt;= k &lt;= ex(n,K_4), where ex(n,K_4) = floor(n^2/3) is the Turan number.
 * @author Sean A. Irvine
 */
public class A399108 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Z[] mCounts = {};
  private Object[] mLocks = null; // Used for safe parallelism

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      ++mN;
      mM = 0;
      mCounts = new Z[mN * mN / 3 + 1];
      mLocks = new Object[mCounts.length];
      for (int k = 0; k < mLocks.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      new ParallelGenerateGraphsSequence(mN - 1, mN - 1, GenerateGraphs.K4_FREE, () -> g -> {
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
