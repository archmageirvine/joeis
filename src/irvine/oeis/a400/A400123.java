package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400123 Number of strongly connected digraphs on n labeled nodes that are reducible as a flow graph rooted at every node.
 * @author Gregory Morse
 */
public class A400123 extends CachedSequence {

  /** Construct the sequence. */
  public A400123() {
    super(1, Integer.class, EverywhereReducibleDigraphs::strong);
  }
}
