package irvine.oeis.a400;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400234 Number of spanning trees in the Klein bottle graph K_{3,2n}.
 * @author Sean A. Irvine
 */
public class A400234 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      // Necessary to handle a multiedge in this particular graph
      return Z.valueOf(350);
    }
    return GraphUtils.numberOfSpanningTrees(GraphFactory.kleinBottle(3, 2 * mN));
  }
}

