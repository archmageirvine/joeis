package irvine.oeis.a399;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399790 Number of spanning trees in the knight graph on an n X n chessboard.
 * @author Sean A. Irvine
 */
public class A399790 extends Sequence1 {

  private static final int[] DELTA_X = {1, 1, -1, -1, 2, 2, -2, -2};
  private static final int[] DELTA_Y = {2, -2, 2, -2, 1, -1, 1, -1};
  private int mN = 0;

  @Override
  public Z next() {
    final Graph g = GraphFactory.create(++mN * mN);
    for (int k = 0, u = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j, ++u) {
        for (int d = 0; d < DELTA_X.length; ++d) {
          final int x = k + DELTA_X[d];
          final int y = j + DELTA_Y[d];
          if (x >= 0 && y >= 0 && x < mN && y < mN) {
            g.addEdge(u, x * mN + y);
          }
        }
      }
    }
    return GraphUtils.numberOfSpanningTrees(g);
  }
}
