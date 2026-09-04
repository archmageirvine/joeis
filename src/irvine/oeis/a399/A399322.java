package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A399322 allocated for Ivan Damnjanovi\u0107.
 * @author Sean A. Irvine
 */
public class A399322 extends ParallelGenerateGraphsSequence {

  private static boolean isTransmissionIrregular(final Graph graph) {
    if (graph.order() < 7) {
      return graph.order() == 1;
    }
    final int[] dist = new int[graph.order()];
    for (int u = 0; u < graph.order(); ++u) {
      dist[u] = Functions.SUM.i(graph.distanceVector(u));
      for (int v = 0; v < u; ++v) {
        if (dist[u] == dist[v]) {
          return false;
        }
      }
    }
    return true;
  }

  /** Construct the sequence. */
  public A399322() {
    super(0, 0, 0, () -> graph -> isTransmissionIrregular(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setMaxDeg(mN - 1);
    gg.setConnectionLevel(1);
  }
}
