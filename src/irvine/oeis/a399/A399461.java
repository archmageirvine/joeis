package irvine.oeis.a399;

import irvine.math.graph.Graph;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.graph.VertexConnectivity;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence2;

/**
 * A399461 allocated for Allan Bickle.
 * @author Sean A. Irvine
 */
public class A399461 extends Sequence2 {

  private int mN = 1;

  private boolean is(final Graph g) {
    return g.diameter() == 2 && MaximumIndependentSet.size(g) == VertexConnectivity.connectivity(g);
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    Z total = Z.ZERO;
    for (int r = 2; r < mN; ++r) {
      final int rr = r;
      final ParallelGenerateGraphsSequence s = new ParallelGenerateGraphsSequence(mN - 1, mN - 1, GenerateGraphs.TRIANGLE_FREE, () -> g -> is(g) ? 1 : 0) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinDeg(rr);
          gg.setMaxDeg(rr);
          gg.setMinEdges(0);
          gg.setMaxEdges(mN * (mN - 1) / 2);
          gg.setConnectionLevel(1);
        }
      };
      total = total.add(s.next());
    }
    return total;
  }
}

