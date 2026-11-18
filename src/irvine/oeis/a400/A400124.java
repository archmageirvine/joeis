package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400124 Number of triples (A, S, R), where A is an acyclic digraph on n labeled nodes and a distinguished node r, S and R are subsets of V(A), r has no out-edge in A and belongs to R, such that adding a new node h with edges h -&gt; S and R -&gt; h gives a strongly connected digraph D reducible as a flow graph from every node, r has exactly one in-edge in D, and D - r is strongly connected.
 * @author Gregory Morse
 */
public class A400124 extends CachedSequence {

  /** Construct the sequence. */
  public A400124() {
    super(0, Integer.class, EverywhereReducibleDigraphs::flatReturn);
  }
}
