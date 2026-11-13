package irvine.oeis.a400;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400234 Number of spanning trees in the 3 X n Klein bottle grid graph.
 * @author Sean A. Irvine
 */
public class A400234 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      // Necessary to handle a multiedge in this particular graph
      return mN == 1 ? Z.SEVEN : Z.valueOf(350);
    }
    return GraphUtils.numberOfSpanningTrees(GraphFactory.kleinBottle(3, mN));
  }
}

