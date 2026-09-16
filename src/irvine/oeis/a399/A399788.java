package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003714;

/**
 * A399788 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399788 extends Sequence0 {

  private final DirectSequence mZ = DirectSequence.create(new A003714());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int order = Functions.FIBONACCI.i(mN + 2);
    final Graph g = GraphFactory.create(order);
    for (int u = 0; u < order; ++u) {
      final Z zu = mZ.a(u);
      for (int v = u + 1; v < order; ++v) {
        if (zu.xor(mZ.a(v)).bitCount() == 1) {
          g.addEdge(u, v);
        }
      }
    }
    return GraphUtils.numberOfSpanningTrees(g);
  }
}
