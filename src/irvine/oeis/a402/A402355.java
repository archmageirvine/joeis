package irvine.oeis.a402;

import irvine.math.graph.UnlabeledReducibleElections;
import irvine.oeis.CachedSequence;

/**
 * A402355 Number of strongly connected digraphs on n unlabeled nodes that are reducible as a flow graph rooted at every node.
 * @author Gregory Morse
 */
public class A402355 extends CachedSequence {

  /** Construct the sequence. */
  public A402355() {
    super(1, Integer.class, new UnlabeledReducibleElections(true)::strong);
  }
}
