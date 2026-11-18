package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400559 Number of triples (B, g, e) with B a strongly connected digraph on n labeled nodes, g and e nodes of B, such that adding a new node r with edges e -&gt; r and r -&gt; g yields a digraph reducible as a flow graph rooted at every node.
 * @author Gregory Morse
 */
public class A400559 extends CachedSequence {

  /** Construct the sequence. */
  public A400559() {
    super(1, Integer.class, EverywhereReducibleDigraphs::block);
  }
}
