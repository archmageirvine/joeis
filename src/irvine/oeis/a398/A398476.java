package irvine.oeis.a398;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A398476 Number of singular simple connected graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A398476 extends ParallelGenerateGraphsSequence {

  // We can get away without setting the ring size here
  private static final MatrixField<Z> RING = new MatrixField<>(0, IntegerField.SINGLETON);

  private static boolean singular(final Graph g) {
    return RING.det(GraphUtils.toAdjacencyMatrix(g)).isZero();
  }

  /** Construct the sequence. */
  public A398476() {
    super(1, 0, 0, 0, () -> graph -> singular(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
