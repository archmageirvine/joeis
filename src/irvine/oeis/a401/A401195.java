package irvine.oeis.a401;

import irvine.math.api.Matrix;
import irvine.math.graph.Graph;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A087101.
 * @author Sean A. Irvine
 */
public class A401195 extends ParallelGenerateGraphsSequence {

  /**
   * Tests if the sandpile group of the given graph is cyclic.
   * @param g graph
   * @return true if the sandpile group is cyclic, false otherwise
   */
  private static boolean isCyclicSandpileGroup(final Graph g) {
    final int n = g.order();
    if (n <= 2) {
      return true; // Graphs with 1 or 2 vertices always have cyclic (or trivial) sandpile groups
    }

    // Construct the (n-1) x (n-1) reduced Laplacian matrix (omitting the last row and column)
    final int m = n - 1;
    final DefaultMatrix<Z> reducedLaplacian = new DefaultMatrix<>(m, m, Z.ZERO);
    for (int i = 0; i < m; ++i) {
      for (int j = g.nextVertex(i, -1); j >= 0 && j < m; j = g.nextVertex(i, j)) {
        reducedLaplacian.set(i, j, Z.NEG_ONE);
      }
      reducedLaplacian.set(i, i, Z.valueOf(g.degree(i)));
    }

    // Compute the gcd of all (n-2) x (n-2) minors of the reduced Laplacian
    final MatrixField<Z> fld = new MatrixField<>(m - 1, IntegerField.SINGLETON);
    Z gcdMinors = Z.ZERO;
    for (int r = 0; r < m; ++r) {
      for (int c = 0; c < m; ++c) {
        final Matrix<Z> sub = reducedLaplacian.delete(r, c);
        final Z det = fld.det(sub);
        gcdMinors = gcdMinors.gcd(det);
      }
    }

    // The sandpile group is cyclic iff the GCD of all (n-2)-minors is 1
    return gcdMinors.isOne();
  }

  /** Construct the sequence. */
  public A401195() {
    super(1, 0, 0, () -> g -> isCyclicSandpileGroup(g) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
