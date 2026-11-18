package irvine.oeis.a401;

import irvine.math.graph.LabeledValidHeaders;
import irvine.oeis.CachedSequence;

/**
 * A401321 Number of strongly connected digraphs on n labeled nodes that are reducible as a flow graph rooted at some node.
 * @author Gregory Morse
 */
public class A401321 extends CachedSequence {

  /** Construct the sequence. */
  public A401321() {
    super(1, Integer.class, new LabeledValidHeaders()::some);
  }
}
