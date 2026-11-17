package irvine.oeis.a402;

import irvine.math.graph.UnlabeledReducibleElections;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402354 Number of digraphs on n unlabeled nodes, self-loops allowed, that are reducible for every election of source-SCC headers.
 * @author Gregory Morse
 */
public class A402354 extends Sequence1 {

  private final UnlabeledReducibleElections mElections = new UnlabeledReducibleElections(true);
  private int mN = 0;

  @Override
  public Z next() {
    return mElections.count(++mN, true);
  }
}
