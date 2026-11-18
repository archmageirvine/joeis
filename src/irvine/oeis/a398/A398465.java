package irvine.oeis.a398;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A398465 Number of reducible flow graphs on n labeled nodes with entry node 1: digraphs in which every node is reachable from node 1 and every cycle has a unique entry node (Hecht-Ullman reducibility).
 * @author Gregory Morse
 */
public class A398465 extends CachedSequence {

  /** Construct the sequence. */
  public A398465() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::rooted);
  }
}
