package irvine.oeis.a399;

import irvine.math.graph.SmallGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399322.
 * @author Sean A. Irvine
 */
public class A399953 extends ParallelGenerateGraphsSequence {

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
  public A399953() {
    super(-1, 0, 0, () -> graph -> isNeighborhoodHypergraphHausdorff((SmallGraph) graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
