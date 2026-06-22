package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396634 Number of distinct spanning trees of the coprime graph on vertices {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A396634 extends Sequence1 {

  private int mN = 0;

  private Graph buildCoprimeGraph(final int n) {
    final Graph comprimeGraph = GraphFactory.create(n);
    for (int k = 1; k <= n; ++k) {
      for (int j = k + 1; j <= n; ++j) {
        if (Functions.GCD.l(j, k) == 1) {
          comprimeGraph.addEdge(k - 1, j - 1);
        }
      }
    }
    return comprimeGraph;
  }

  @Override
  public Z next() {
    return GraphUtils.numberOfSpanningTrees(buildCoprimeGraph(++mN));
  }
}

