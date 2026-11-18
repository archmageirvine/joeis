package irvine.oeis.a399;

import irvine.math.graph.UnlabeledReducibleElections;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399885 Number of digraphs on n unlabeled nodes, self-loops disallowed, that are reducible for some election of source-SCC headers.
 * @author Gregory Morse
 */
public class A399885 extends Sequence1 {

  private final UnlabeledReducibleElections mElections = new UnlabeledReducibleElections(false);
  private int mN = 0;

  @Override
  public Z next() {
    return mElections.count(++mN, false);
  }
}
