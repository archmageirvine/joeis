package irvine.oeis.a396;

import irvine.math.api.Matrix;
import irvine.math.graph.GraphUtils;
import irvine.math.group.MatrixRing;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a064.A064731;

/**
 * A396924 Number of connected regular integral graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A396924 extends Sequence1 {

  private static class RegularIntegralGraphs extends ParallelGenerateGraphsSequence {
    private final int mR;

    RegularIntegralGraphs(final int n, final int r) {
      super(n, n - 1, 1, 0, () -> graph -> {
        // Graph is integral if its characteristic polynomial factors over the integers
        final MatrixRing<Z> ring = new MatrixRing<>(graph.order(), Integers.SINGLETON);
        final Matrix<Z> adj = GraphUtils.toAdjacencyMatrix(graph);
        final Polynomial<Z> cp = ring.characteristicPolynomial(adj);
        //System.out.println(graph + " " + adj + " " + cp + " " + is(cp));
        return A064731.is(cp) ? 1 : 0;
      });
      mR = r;
    }

    @Override
    protected void graphGenInit(final GenerateGraphs gg) {
      gg.setVertices(mN);
      gg.setMinEdges((mR * mN) / 2);
      gg.setMaxEdges((mR * mN) / 2);
      gg.setMinDeg(mR);
      gg.setMaxDeg(mR);
      gg.setConnectionLevel(1);
    }
  }

  private int mM = 0;

  @Override
  public Z next() {
    if (++mM == 1) {
      return Z.ONE; // only case with r == 0
    }
    Z sum = Z.ZERO;
    for (int r = 1; r < mM; ++r) {
      if (((r * mM) & 1) == 0) {
        sum = sum.add(new RegularIntegralGraphs(mM, r).next());
      }
    }
    return sum;
  }
}
