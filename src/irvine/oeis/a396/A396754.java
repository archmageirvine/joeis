package irvine.oeis.a396;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A396754 allocated for Brock Falfas.
 * @author Sean A. Irvine
 */
public class A396754 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A396754() {
    super(2, 2, 0, () -> graph -> graph.diameter() == 2 && isTwinFree(graph) && isCritical(graph) ? 1 : 0);
  }

  private static boolean isCritical(final Graph graph) {
    for (int u = 0; u < graph.order(); ++u) {
      for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
        graph.removeEdge(u, v);
        if (graph.isConnected() && graph.diameter() <= 2) {
          return false;
        }
        graph.addEdge(u, v);
      }
    }
    return true;
  }

  private static boolean isTwinFree(final Graph graph) {
    for (int u = 0; u < graph.order(); ++u) {
      final long du = graph.degree(u);
      for (int v = 0; v < u; ++v) {
        if (graph.degree(v) == du) {
          boolean twin = true;
          for (int w = graph.nextVertex(v, -1); w >= 0; w = graph.nextVertex(v, w)) {
            if (!graph.isAdjacent(u, w)) {
              twin = false;
              break;
            }
          }
          if (twin) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
