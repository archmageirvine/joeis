package irvine.oeis.a399;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399264 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399264 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A399264() {
    super(0, 0, GenerateGraphs.BIPARTITE, () -> graph -> GraphUtils.automorphismSize(graph).isOne() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    return super.next();
  }
}
