package irvine.oeis.a401;

import irvine.math.graph.UnlabeledReducibleElections;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401995 Number of digraphs on n unlabeled nodes, self-loops allowed, that are reducible for some election of source-SCC headers.
 * @author Gregory Morse
 */
public class A401995 extends Sequence1 {

  private final UnlabeledReducibleElections mElections = new UnlabeledReducibleElections(false);
  private int mN = 0;

  @Override
  public Z next() {
    return mElections.count(++mN, true);
  }
}
