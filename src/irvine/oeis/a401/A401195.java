package irvine.oeis.a401;

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
  public static boolean isCyclicSandpileGroup(final Graph g) {
    final int n = g.order();
    if (n <= 2) {
      return true; // Graphs with 1 or 2 vertices always have cyclic (or trivial) sandpile groups
    }

    // Construct the n x n Laplacian matrix
    final Z[][] laplacian = new Z[n][n];
    for (int i = 0; i < n; i++) {
      long degree = 0;
      for (int j = 0; j < n; j++) {
        if (i != j && g.isAdjacent(i, j)) {
          laplacian[i][j] = Z.NEG_ONE;
          degree++;
        } else {
          laplacian[i][j] = Z.ZERO;
        }
      }
      laplacian[i][i] = Z.valueOf(degree);
    }

    // Construct the (n-1) x (n-1) reduced Laplacian matrix (omitting the last row and column)
    int m = n - 1;
    Z[][] reducedLaplacian = new Z[m][m];
    for (int i = 0; i < m; i++) {
      System.arraycopy(laplacian[i], 0, reducedLaplacian[i], 0, m);
    }

    // For n = 3 (m = 2), the (n-2) minors are 1x1 submatrices (the entries of reducedLaplacian themselves)
    if (m == 1) {
      return true;
    }

    // 3. Compute the GCD of all (n-2) x (n-2) minors of the reduced Laplacian
    Z gcdMinors = Z.ZERO;
    for (int r = 0; r < m; r++) {
      for (int c = 0; c < m; c++) {
        Z[][] sub = submatrix(reducedLaplacian, r, c);
        Z det = determinant(sub);
        gcdMinors = gcdMinors.gcd(det);
      }
    }

    // The sandpile group is cyclic iff the GCD of all (n-2)-minors is 1
    return gcdMinors.equals(Z.ONE);
  }

  /** Helper method to remove a specific row and column to form a minor submatrix. */
  private static Z[][] submatrix(Z[][] mat, int skipRow, int skipCol) {
    int n = mat.length;
    Z[][] sub = new Z[n - 1][n - 1];
    int rIdx = 0;
    for (int i = 0; i < n; i++) {
      if (i == skipRow) {
        continue;
      }
      int cIdx = 0;
      for (int j = 0; j < n; j++) {
        if (j == skipCol) {
          continue;
        }
        sub[rIdx][cIdx] = mat[i][j];
        cIdx++;
      }
      rIdx++;
    }
    return sub;
  }

  private static Z determinant(Z[][] matrix) {
    return new MatrixField<>(matrix.length, IntegerField.SINGLETON).det(new DefaultMatrix<>(matrix, Z.ZERO));
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
    gg.setConnectionLevel(1); // note there are more results if non-connected are considered
  }
}
