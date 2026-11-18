package irvine.oeis.a401;

import irvine.math.graph.UnlabeledReducibleElections;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401994 Number of digraphs on n unlabeled nodes, self-loops disallowed, that are reducible for every election of source-SCC headers.
 * @author Gregory Morse
 */
public class A401994 extends Sequence1 {

  private final UnlabeledReducibleElections mElections = new UnlabeledReducibleElections(true);
  private int mN = 0;

  @Override
  public Z next() {
    return mElections.count(++mN, false);
  }
}
