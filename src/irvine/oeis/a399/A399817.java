package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.SmallGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399817 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399817 extends ParallelGenerateGraphsSequence {

  private static boolean is(final SmallGraph graph, final int x, final int y) {
    for (int u = graph.nextVertex(x, -1); u >= 0; u = graph.nextVertex(x, u)) {
      for (int v = graph.nextVertex(y, -1); v >= 0; v = graph.nextVertex(y, v)) {
        if ((graph.getEdgeVector(u) & graph.getEdgeVector(v)) == 0) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean isNeighborhoodHypergraphHausdorff(final SmallGraph graph) {
    for (int x = 0; x < graph.order(); ++x) {
      for (int y = x + 1; y < graph.order(); ++y) {
        if (!is(graph, x, y)) {
          return false;
        }
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A399817() {
    super(-1, 0, 0, () -> graph -> isNeighborhoodHypergraphHausdorff((SmallGraph) graph)
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
