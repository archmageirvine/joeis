package irvine.oeis.a401;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A087101.
 * @author Sean A. Irvine
 */
public class A401566 extends ParallelGenerateGraphsSequence {

  private static boolean accept(final Graph graph) {
    // A quartic symmetric graph must be:
    // 1. 4-regular (guaranteed by generator)
    // 2. Vertex-transitive (automorphism group has a single vertex orbit)
    // 3. Edge-transitive (its line graph is vertex-transitive)
    if (graph.order() <= 1) {
      return false;
    }
    return GraphUtils.isVertexTransitive(graph) && GraphUtils.isEdgeTransitive(graph);
  }

  /** Construct the sequence. */
  public A401566() {
    super(0, 4, 0, () -> g -> accept(g) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(2 * mN);
    gg.setMaxEdges(2 * mN);
    gg.setMinDeg(4);
    gg.setMaxDeg(4);
    gg.setConnectionLevel(1);
  }
}
