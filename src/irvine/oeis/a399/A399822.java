package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.SmallGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399822 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399822 extends ParallelGenerateGraphsSequence {

  private static boolean isSperner(final SmallGraph graph) {
    for (int u = 0; u < graph.order(); ++u) {
      final long e = graph.getEdgeVector(u);
      for (int v = u + 1; v < graph.order(); ++v) {
        final long f = graph.getEdgeVector(v);
        final long intersection = e & f;
        if (intersection == e || intersection == f) {
          return false;
        }
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A399822() {
    super(-1, 0, 0, () -> graph -> isSperner((SmallGraph) graph)
      ? Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph)).longValueExact()
      : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
