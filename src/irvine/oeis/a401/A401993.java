package irvine.oeis.a401;

import irvine.math.graph.LabeledValidHeaders;
import irvine.oeis.CachedSequence;

/**
 * A401993 Number of strongly connected digraphs on n labeled nodes that are reducible as a flow graph rooted at node 1 and also rooted at node 2.
 * @author Gregory Morse
 */
public class A401993 extends CachedSequence {

  /** Construct the sequence. */
  public A401993() {
    super(2, Integer.class, new LabeledValidHeaders()::two);
  }
}
