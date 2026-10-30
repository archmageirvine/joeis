package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A401394 allocated for Per W. Alexandersson.
 * @author Sean A. Irvine
 */
public class A401394 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A401394() {
    super(-1, -1, 0, () -> g -> g.order() < 1 || g.isChordal() ? Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)).longValueExact() : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
    gg.setPruner((graph, n) -> !GraphUtils.isClawFree(graph));
  }
}
