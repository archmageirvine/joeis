
package irvine.oeis.a401;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401671 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A401671 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Graph g = GraphFactory.grid(mN, mN);
    // add diagonals (x,y)-(x+1,y+1)
    for (int x = 1; x < mN; ++x) {
      for (int y = 1; y < mN; ++y) {
        g.addEdge(y * mN + x, (y - 1) * mN + (x - 1));
      }
    }
    return GraphUtils.numberOfSpanningTrees(g);
  }
}
