package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400560 Number of acyclic digraphs A on n labeled nodes together with node sets S and R such that adding a new node h with edges from h to every node of S and from every node of R to h yields a strongly connected digraph that is reducible as a flow graph rooted at every node.
 * @author Gregory Morse
 */
public class A400560 extends CachedSequence {

  /** Construct the sequence. */
  public A400560() {
    super(1, Integer.class, EverywhereReducibleDigraphs::flat);
  }
}
